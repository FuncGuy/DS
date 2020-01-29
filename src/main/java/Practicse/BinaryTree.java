package Practicse;

public class BinaryTree {
     Node root;

     public BinaryTree(){
         this.root = null;
     }

     public static BinaryTree constructBST() {
         BinaryTree binaryTree = new BinaryTree();
         binaryTree.root = new Node(1);
         binaryTree.root.left = new Node(2);
         binaryTree.root.right = new Node(3);
         binaryTree.root.left.left = new Node(4);
         return binaryTree;

     }



    public static void preorder(Node root)
    {
        // return if the current Node is empty
        if (root == null) {
            return;
        }

        // Display the data part of the root (or current Node)
        System.out.print(root.key + " ");

        // Traverse the left subtree
        preorder(root.left);

        // Traverse the right subtree
        preorder(root.right);
    }
}


