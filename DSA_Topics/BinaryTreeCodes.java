import java.util.*;


public class BinaryTreeCodes {   //Node class represents every single node
     static class Node{
         int data;
         Node left;
         Node right;

         Node(int data) {       //Constructor 
             this.data=data;
             this.left=null;
             this.right=null;
         }
     }
    
     static class BinaryTree{
       static int idx = -1;
       public static Node buildTree(int nodes[]) {
         idx++;
         if(nodes[idx] == -1){
             return null;
         }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
       }
     }
 public static void main(String[] args) {
     int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     BinaryTree tree = new BinaryTree();

     Node root = BinaryTree.buildTree(nodes);
     System.out.print(diameter2(root).diam);    // Here the output is called for whatever function required.
 }



 //Tree Traversal Functions Root>Left>Right
    
 //Preorder Traversal 
  public static void preorder(Node root) {
    if(root==null){
    System.out.println(-1+" ");
    return;
 }
System.out.print(root.data+" ");
preorder(root.left);
preorder(root.right);
 }


 //Inorder Treversal LeftSubtree>Root>Right Subtree
 public static void inorder(Node root) {
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}


//PostOrder Treversal: Left Subtree>Right Subtree>Root 
  public static void postorder(Node root) {
    if(root==null){
    return;
 }
 postorder(root.left);
 postorder(root.right);
 System.out.print(root.data+" ");
  }



//Level Order:  iteration is used,queue is used.
public static void levelOrder(Node root){
    if(root == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

      while(!q.isEmpty()){
        Node currNode = q.remove();
        if (currNode == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            } else {
                q.add(null);
            }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
      }


      //Sum of Nodes of Tree : Reccursion 
public static int sumofNodes(Node root){
if(root == null){
    return 0;
}
int leftSum = sumofNodes(root.left);
int rightSum = sumofNodes(root.right);
return leftSum+rightSum+root.data;
}


//Count of Nodes of Tree
public static int countofNodes(Node root){
if(root == null){
    return 0;
}
int left = countofNodes(root.left);
int right = countofNodes(root.right);

return left+right+1;
}


// Height of Tree 
public static int height(Node root){
    if(root==null){
        return 0;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    int myHeight = Math.max(leftHeight,rightHeight)+1;
    return myHeight;
}



//Diameter of Tree : Longest path between two nodes 
//n2 time 
public static int diameter(Node root){
    if(root ==null){
        return 0;
    }
    int diam1= height(root.left)+height(root.right)+1;
    int diam2= diameter(root.left);
    int diam3= diameter(root.right);

    return Math.max(diam1, Math.max(diam2, diam3));

}


//0(n) time
static class TreeInfo{
    int ht;
    int diam;

    TreeInfo(int ht, int diam){
        this.ht = ht;
        this.diam =diam;
    }
}
public static TreeInfo diameter2(Node root){
    if(root==null){
        return new TreeInfo(0,0);
    }
    TreeInfo left = diameter2(root.left);
    TreeInfo right = diameter2(root.left);
    
    int myHeight = Math.max(left.ht, right.ht)+1;

    int diam1 = left.diam;
    int diam2 = right.diam;
    int diam3 = left.ht+right.ht+1;

    int mydiam = Math.max(Math.max(diam1, diam2), diam3);
    
    TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
    return myInfo;

}
}







