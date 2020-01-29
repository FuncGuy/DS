import java.util.LinkedList;

public class CircularLinkedList {

    static LinkedList adj[];

    Node head;
    Node tail;

    public static void main(String[] args) {
        /*CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(1);
        circularLinkedList.head.next = new Node(2);
        circularLinkedList.display();*/


    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;
        tail.next = head;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


}