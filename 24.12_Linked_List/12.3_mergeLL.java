class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class mergeLL {              //TC -O(nlogn)
    public Node head;

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node margeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = margeSort(head);
        Node newRight = margeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public void print() { // print
        if (head == null) {
            System.out.println("Empty LinkedList");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        mergeLL ll = new mergeLL();

        // create linked list manually
        ll.head = new Node(5);
        ll.head.next = new Node(4);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(2);
        ll.head.next.next.next.next = new Node(1);

        ll.print();

        ll.head = ll.margeSort(ll.head);

        ll.print();
    }
}
