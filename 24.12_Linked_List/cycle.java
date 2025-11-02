public class cycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Q1:- Cycle or Loop in a cycle
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Q2:- Remove cycle from LL
    public static void removeCycle() {
        // detecting cycle
        Node slow = head;
        Node fast = head;
        boolean iscycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                iscycle = true;
                break;
            }
        }
        if (iscycle == false) {
            return;
        }

        // finding the meeting point
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        Node temp = new Node(2);
        head = new Node(5);
        head.next = new Node(6);
        head.next.next = temp;
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = temp;
        // head.next.next.next.next = head;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}