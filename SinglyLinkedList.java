public class SinglyLinkedList {             //v-36-41
    private ListNode head;

    private static class ListNode{
        private int data;       //generic Type
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void display(){                  //v-40
        ListNode current=head;
        while (current!=null) {
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public int length(){                    //v-42
        if(head == null){
        return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {            //v-38
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);

        //npw we will connect them together to form a chain
        sll.head.next=second;   //10-->1
        second.next=third;      //10-->1-->8
        third.next=fourth;      //10-->1-->8-->11-->null
        sll.display();
        System.out.println("Length is - " + sll.length());
    }
}
