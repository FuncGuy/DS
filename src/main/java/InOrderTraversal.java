public class InOrderTraversal {

    static class Node {
        int key;
        Node right, left;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void inorder(Node root) {

        // return if the current node is empty
        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.key + ",");

        inorder(root.right);
    }

    public static Node insertRecord(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRecord(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecord(root.right, key);
        }
        return root;
    }

    // A utility function to search a given key in BST
    public static Node search(Node root, int key)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.key==key)
            return root;

        // val is greater than root's key
        if (root.key < key)
            return search(root.left, key);

        // val is less than root's key
        return search(root.right, key);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(9);

        //insertRecord(root, 8);

        //inorder(root);

        System.out.println(search(root, 7).key);


    }
}
