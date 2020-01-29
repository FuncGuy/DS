package Practicse;

public class MergeTwoLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList p = new SinglyLinkedList();
        p.head = new SinglyLinkedList.Node(10);
        p.head.next = new SinglyLinkedList.Node(50);
        p.head.next.next = new SinglyLinkedList.Node(70);
        p.head.next.next.next = new SinglyLinkedList.Node(90);
        p.head.next.next.next.next = new SinglyLinkedList.Node(100);

        SinglyLinkedList q = new SinglyLinkedList();
        q.head = new SinglyLinkedList.Node(20);
        q.head.next = new SinglyLinkedList.Node(30);
        q.head.next.next = new SinglyLinkedList.Node(40);
        q.head.next.next.next = new SinglyLinkedList.Node(60);
        q.head.next.next.next.next = new SinglyLinkedList.Node(80);

        SinglyLinkedList s = new SinglyLinkedList();

        SinglyLinkedList.Node node  = merge(p.head, q.head, s.head);

        while (node !=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static SinglyLinkedList.Node merge(SinglyLinkedList.Node p, SinglyLinkedList.Node q, SinglyLinkedList.Node s) {

        SinglyLinkedList.Node newNode;

        if (p == null) return q;
        if (q == null) return p;

        if (p != null && q != null) {

            if (p.data <= q.data) {
                s = p;
                p = s.next;
            }else{
                s = q;
                q = s.next;
            }
        }

        newNode = s;

        while(p != null && q != null)   {
            if(p.data <= q.data){
                s.next = p;
                s = p;
                p = s.next;
            }else{
                s.next = q;
                s = q;
                q = s.next;
            }
        }

        if (p == null) s.next = q;
        if(q == null) s.next = p;



        return newNode;
    }
}
