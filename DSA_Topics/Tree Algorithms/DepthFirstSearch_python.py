# Depth First Search Algorithm implementation in Python.

class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def inorder_traversal(root):
    if root is None:
        return 
    
    inorder_traversal(root.left)
    print(root.data, end=" ")
    inorder_traversal(root.right)

def preorder_traversal(root):
    if root is None:
        return 

    print(root.data, end=" ")
    preorder_traversal(root.left)
    preorder_traversal(root.right)

def postorder_traversal(root):
    if root is None:
        return 

    postorder_traversal(root.left)
    postorder_traversal(root.right)
    print(root.data, end=" ")

if __name__ == "__main__":
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(7)

    print("Inorder Traversal:", end=" ")
    inorder_traversal(root)
    print()

    print("Preorder Traversal:", end=" ")
    preorder_traversal(root)
    print()

    print("Postorder Traversal:", end=" ")
    postorder_traversal(root)
    print()




