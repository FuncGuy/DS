package Practicse;

import java.util.*;

public class RightView
{
    private static class Node
    {
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }

    }

    private static void printRightView(Node root)
    {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            // number of nodes at current level 
            int n = queue.size();

            // Traverse all nodes of current level 
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();

                // Print the right most element at 
                // the level 
                if (i == n)
                    System.out.print(temp.data + " ");

                // Add left node to queue 
                if (temp.left != null)
                    queue.add(temp.left);

                // Add right node to queue 
                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
    }

    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);

        printRightView(root);

        new HashMap<>().get(null);
    }
} 
