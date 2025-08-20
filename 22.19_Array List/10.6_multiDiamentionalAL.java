import java.util.*;

class multiDiamentionalAL {
    // public static void main(String[] args) {
    // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(1);
    // list.add(2);
    // mainList.add(list);

    // ArrayList<Integer> list2 = new ArrayList<>();
    // list2.add(3);
    // list2.add(4);
    // mainList.add(list2);

    // for (int i = 0; i < mainList.size(); i++) {
    // ArrayList<Integer> currentList = mainList.get(i);
    // for (int j = 0; j < currentList.size(); j++) {
    // System.out.print(currentList.get(j) + " ");
    // }
    // System.out.println();
    // }
    // System.out.println(mainList);
    // }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(1 * i);
            list2.add(2 * i);
            list3.add(3 * i);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currentList = mainList.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
    }
}