public class ReverseList {

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    public Node reverse(Node node) {

        Node current = node;
        Node next;
        Node prev = null;
        while (current != null) {

        }
        node = prev;
        return node;
    }

    public void insertAfter(Node prev, int data){
        Node newNode = new Node(data);
        prev.next = newNode;
        newNode.next = prev.next.next;
    }

    public void disp(Node node) {
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        list.head = new Node(85);
        Node next2 = list.head.next;
        next2 = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        list.insertAfter(next2,155);
        System.out.println("After Reverse....");

         //head = list.reverse(head);

        list.disp(head);

    }

}
