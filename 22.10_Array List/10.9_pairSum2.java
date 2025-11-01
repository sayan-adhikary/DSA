import java.util.*;

class pairSum2 {
    static boolean sum2(ArrayList<Integer> list, int target) {
        //find the break Point
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        //two pointer target    tc=O(n)
        int lp = bp + 1, rp = bp;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n; // lp++
            } else {
                rp = (n + rp - 1) % n; // rp--
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        System.out.println(sum2(height, 21));
    }
}