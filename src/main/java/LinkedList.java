public class LinkedList{

    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void deleteByKey(int data) {

        Node temp = head;

        if(temp!= null && temp.data == data){
            head = head.next;
            return;
        }

        Node prev = null;
        while (temp != null && temp.data != data){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void insertAfter(Node prev, int data) {
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void deleteAtPos(int pos){
        Node temp = head;
        for(int i = 0; temp!=null && i< pos-1; i++){
            temp = temp.next;
        }

        Node next = temp.next.next;
        temp.next = next;
    }

    public void findMiddle(){

        Node slowPtr = head;
        Node fastPtr = head;

        while(fastPtr != null && fastPtr.next !=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        System.out.println("mid node is "+ slowPtr.data);

    }

    public void search(int key) {

        Node temp = head;

        boolean isfound = false;

        while(temp != null && temp.data != key) {
            temp = temp.next;
        }

        if(temp != null && temp.data == key){
            isfound =  true;
        }
        System.out.println(isfound);

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        Node node2 = new Node(2);
        linkedList.head.next = node2;
        linkedList.head.next.next = new Node(3);
        linkedList.deleteByKey(1);
        linkedList.insertAtLast(4);
        linkedList.insertAtLast(5);
        linkedList.insertAfter(node2, 22);
        linkedList.insertAtHead(0);
        linkedList.deleteAtPos(4);
        linkedList.display();
        linkedList.findMiddle();
        linkedList.search(0);
    }
}