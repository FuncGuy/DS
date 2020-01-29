import java.util.Stack;

public class IntersectionList {

    Node head;

    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }

    public static int count(IntersectionList intersectionList) {
        int count = 0;

        Node temp = intersectionList.head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
        IntersectionList list1 = new IntersectionList();
        Node node2 = new Node("b");
        Node node3 = new Node("c");
        Node node4 = new Node("d");
        Node node5 = new Node("e");
        Node node6 = new Node("f");
        Node node7 = new Node("g");

        Node head = new Node("a");
        list1.head = head;
        list1.head.next = node2;
        list1.head.next.next = node3;
        list1.head.next.next.next = node4;
        list1.head.next.next.next.next = node5;
        list1.head.next.next.next.next.next = node6;
        list1.head.next.next.next.next.next.next = node7;

        IntersectionList list2 = new IntersectionList();
        Node head2 = new Node("m");
        list2.head = head2;
        Node snd = new Node("n");
        list2.head.next = snd;
        list2.head.next.next = node5;
        list2.head.next.next.next = node6;
        list2.head.next.next.next.next = node7;

        Stack<Node> stack1 = new Stack<>();
        stack1.push(head);
        stack1.push(node2);
        stack1.push(node3);
        stack1.push(node4);
        stack1.push(node5);
        stack1.push(node6);
        stack1.push(node7);

        Stack<Node> stack2 = new Stack<>();
        stack2.push(head2);
        stack2.push(snd);
        stack2.push(node5);
        stack2.push(node6);
        stack2.push(node7);

        Node temp = null;

        while (stack1.pop().data == stack2.pop().data) {
            temp = stack1.pop();

        }
        System.out.println(temp.data);
    }
}
