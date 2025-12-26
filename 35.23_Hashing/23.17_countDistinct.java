import java.util.*;
class countDistinct {
    public static int distict(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        return hs.size();
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,5,6,7,3,4,2,1};
        System.out.println(distict(nums));
    }
}