import java.util.*;

class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        // add element
        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(2, 6);
        System.out.println("Adding element:- " + list);

        // get element:- O(1)
        System.out.println("Getting Element:- " + list.get(2));

        // remove element
        list.remove(2);
        System.out.println(list);

        // set
        list.set(2, 10);
        System.out.println(list);

        // contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
