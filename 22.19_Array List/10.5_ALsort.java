import java.util.*;

class ALsort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(4);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);

        Collections.reverse(list);
        System.err.println(list);
    }
}
