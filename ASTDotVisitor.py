from generated.lensVisitor import lensVisitor

class ASTDotVisitor(lensVisitor):
    def __init__(self):
        self.result = ["digraph AST {"]
        self.result.append("node [shape=box, style=filled, fillcolor=lightblue];")
        self.count = 0

    def next_id(self):
        self.count += 1
        return f"node{self.count}"

    def add_node(self, label):
        label = str(label).replace('"', '\\"').replace('\n', '\\n').replace('\t', '\\t')
        node_id = self.next_id()
        self.result.append(f'{node_id} [label="{label}"];')
        return node_id

    def visitChildren(self, node):
        if not node:
            return self.add_node("NULL")
            
        parent_id = self.add_node(type(node).__name__)
        
        try:
            child_count = node.getChildCount()
            if child_count == 0:
                # Nó folha - adicionar o texto se existir
                text = getattr(node, 'getText', lambda: "")()
                if text and text.strip():
                    child_id = self.add_node(f'"{text}"')
                    self.result.append(f"{parent_id} -> {child_id};")
            else:
                # Nó interno - visitar filhos
                for i in range(child_count):
                    child = node.getChild(i)
                    if child:
                        if hasattr(child, 'getChildCount') and child.getChildCount() == 0:
                            # Folha terminal
                            child_text = getattr(child, 'getText', lambda: f"child_{i}")()
                            child_id = self.add_node(child_text)
                        else:
                            # Nó interno - visitar recursivamente
                            child_id = self.visit(child)
                        
                        self.result.append(f"{parent_id} -> {child_id};")
        except Exception as e:
            # Em caso de erro, adicionar nó de erro
            error_id = self.add_node(f"ERROR: {str(e)}")
            self.result.append(f"{parent_id} -> {error_id};")
            
        return parent_id

    def get_dot(self):
        self.result.append("}")
        return "\n".join(self.result)

    def save_to_file(self, filename="ast.dot"):
        """Salva o grafo DOT em arquivo."""
        try:
            with open(filename, "w", encoding="utf-8") as f:
                f.write(self.get_dot())
            return True
        except Exception as e:
            print(f"Erro ao salvar {filename}: {e}")
            return False