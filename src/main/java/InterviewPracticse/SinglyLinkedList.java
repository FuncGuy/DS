package InterviewPracticse;

public class SinglyLinkedList {
    static Node head;
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private void display(Node node) {

        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    private Node reverseList(Node node){
        Node prev = null;
        Node next;

        Node current = node;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

       node = prev;

        return node;
    }



    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.head = new Node(1);
        sl.head.next = new Node(2);
        sl.head.next.next = new Node(3);
        Node node4 = new Node(4);
        sl.head.next.next.next = node4;

        Node node = sl.reverseList(head);

        sl.display(node);
    }


}
