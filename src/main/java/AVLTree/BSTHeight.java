package AVLTree;

class BST
{
    int key;
    BST left = null, right = null;

    BST(int key) {
        this.key = key;
    }
}

class BSTHeight {

    // Recursive function to calculate height of given binary tree
    public static int height(BST root)
    {
        // Base case: empty tree has height 0
        if (root == null) {
            return 0;
        }

        // recur for left and right subtree and consider maximum depth
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // main function
    public static void main(String[] args)
    {
        BST root = null;

        root = new BST(15);
        root.left = new BST(10);
        root.right = new BST(20);
        root.left.left = new BST(8);
        root.left.right = new BST(12);
        root.right.left = new BST(16);
        root.right.right = new BST(25);

        System.out.print("The height of the binary tree is " + height(root));
    }
}
