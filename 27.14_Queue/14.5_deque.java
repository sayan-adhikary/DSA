import java.util.*;
class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(3);
        dq.addLast(2);
        dq.addFirst(1);
        dq.addFirst(4);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeFirst());

        System.out.println(dq);
    }
    
}
