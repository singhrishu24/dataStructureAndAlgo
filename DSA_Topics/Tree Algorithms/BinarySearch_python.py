# Binary Search Implementation using Python

class TreeNode:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None

class BinarySearchTree:
    def __init__(self):
        self.root = None

    def insert(self, key):
        self.root = self._insert_node(self.root, key)

    def _insert_node(self, root, key):
        if root is None:
            return TreeNode(key)

        if key < root.key:
            root.left = self._insert_node(root.left, key)
        elif key > root.key:
            root.right = self._insert_node(root.right, key)
        return root

    def delete(self, key):
        self.root = self._delete_node(self.root, key)

    def _delete_node(self, root, key):
        if root is None:
            return None

        if key < root.key:
            root.left = self._delete_node(root.left, key)
        elif key > root.key:
            root.right = self._delete_node(root.right, key)
        else:
            if root.left is None:
                return root.right
            elif root.right is None:
                return root.left
            
            min_node = self._find_min_node(root.right)
            root.key = min_node.key
            root.right = self._delete_node(root.right, min_node.key)
        return root

    def _find_min_node(self, node):
        while node.left is not None:
            node = node.left
        return node

    def search(self, key):
        return self._search_node(self.root, key)

    def _search_node(self, root, key):
        if root is None:
            return False
        if key == root.key:
            return True
        elif key < root.key:
            return self._search_node(root.left, key)
        else:
            return self._search_node(root.right, key)

if __name__ == "__main__":
    bst = BinarySearchTree()

    bst.insert(50)
    bst.insert(30)
    bst.insert(20)
    bst.insert(40)
    bst.insert(70)
    bst.insert(60)
    bst.insert(80)

    print("Search 20:", bst.search(20))
    print("Search 90:", bst.search(90))

    bst.delete(20)
    bst.delete(70)

    print("Search 20 after deletion:", bst.search(20))
    print("Search 70 after deletion:", bst.search(70))                

