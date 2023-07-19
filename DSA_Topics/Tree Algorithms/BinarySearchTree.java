// BST : Binary Search Tree 

class TreeNode{
    int key; 
    TreeNode left;
    TreeNode right;

    public TreeNode (int key){
        this.key = key;
        this.left = null;
        this.right = null; 
    }
}


public class BinarySearchTree{
    private TreeNode root;

    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(int key){
        root = insertNode(root, key);
    }

    private TreeNode insertNode(TreeNode root, int key){
        if (root == null){
            return new TreeNode(key);
        }

        if (key < root.key){
            root.left = insertNode(root.left, key);
        } else if (key > root.key) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    public void delete(int key){
        root = deleteNode(root, key);
    }

    private TreeNode deleteNode(TreeNode root, int key){
        if (root == null){
            return null;
        }

        if (key < root.key){
            root.left = deleteNode(root.left, key);
        } else if (key > root.key){
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            }

            TreeNode minNode = findMinNode(root.right);
            root.key = minNode.key;
            root.right = deleteNode(root.right, minNode.key);
        }
        return root;
    }

    private TreeNode findMinNode(TreeNode node){
        while (node.left != null){
            node = node.left;
        }
        return node;
    }

    public boolean search(int key){
        return searchNode(root, key);
    }

    private boolean searchNode(TreeNode root, int key){
        if (root == null){
            return false;
        }

        if (key == root.key){
            return true;
        } else if (key < root.key){
            return searchNode(root.left, key);
        } else {
            return searchNode(root.right, key);
        }
    }

    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Search 20: " + bst.search(20)); //true
        System.out.println("Search 90: " + bst.search(90)); //false

        bst.delete(20);
        bst.delete(70);

        System.out.println("Search 20 after deletion: " + bst.search(20)); //false
        System.out.println("Search 70 after deletion: " + bst.search(70)); //false
    }
}