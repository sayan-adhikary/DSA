public class InsertSinglyLinkedList {                       //v-44
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
    
        public void insertFirst(int value){                 //v-44,45
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
        }

        public void insertLast(int value){                  //v-46,47
            ListNode newNode = new ListNode(value);
            if(head == null){
                head = newNode;
                return;
            }
            ListNode current = head;
            while (null != current.next) {
                current = current.next;
            }
            current.next = newNode;
        }

        public void insert(int position, int value){
            //1 --> 4 --> 5
            //1 --> 6 --> 4 --> 5
            ListNode node = new ListNode(value);

            if(position == 1){
                node.next = head;
                head = node;
            }else{
                ListNode previous = head;
                int count = 1;  //position -1

                while (count < position - 1) {
                    previous = previous.next;
                    count++;
                }
                ListNode current = previous.next;
                previous.next = node;
                node.next = current;
            }
        }
        public static void main(String[] args) {            
            InsertSinglyLinkedList sll=new InsertSinglyLinkedList();

            // sll.insertFirst(11);
            // sll.insertFirst(8);
            // sll.insertFirst(1);

            // sll.insertLast(11);
            // sll.insertLast(8);
            // sll.insertLast(1);

            sll.insert(1,3); // 3 -> null                          //Insert a node in a Singly Linked List at a given position
            sll.insert(2,5); // 3 -> 5 -> null
            sll.insert(1,2); // 2 -> 3 -> 5 -> null
            sll.insert(2,4); // 2 -> 4 -> 3 -> 5 -> null
            sll.insert(5,7); // 2 -> 4 -> 3 -> 5 -> 7 -> null
            
            sll.display();
         }
    }