package Practicse;
import java.util.*;

public class LeftView
{
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    static Queue<Node> q = new LinkedList<>();

    static void leftViewUtil( Node root )
    {
        if (root == null)
            return;

        // add root
        q.add(root);

        // Delimiter
        q.add(null);

        while (q.size() > 0)
        {
            Node temp = q.peek();

            if (temp != null)
            {
                // Prints first Node
                // of each level
                System.out.print(temp.data + " ");

                // add children of all nodes at
                // current level
                while (q.peek() != null)
                {
                    // If left child is present
                    // add into queue
                    if (temp.left != null)
                        q.add(temp.left);

                    // If right child is present
                    // add into queue
                    if (temp.right != null)
                        q.add(temp.right);

                    // remove the current Node
                    q.remove();

                    temp = q.peek();
                }

                // add delimiter
                // for the next level
                q.add(null);
            }

            // remove the delimiter of
            // the previous level
            q.remove();
        }
    }


    public static void main(String args[])
    {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.left.right = new Node(6);
        root.right.left.right.left = new Node(18);
        root.right.left.right.right = new Node(7);

        leftViewUtil(root);
    }
}

