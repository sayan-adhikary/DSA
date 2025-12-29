import java.util.*;

class largestSubarray {
    public static int largestSarr(int[] nums) {     //TC-O(n)

        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int length = 0;
        for (int j = 0; j < nums.length; j++) {
            sum+=nums[j];
            if(hm.containsKey(sum)){
                length = Math.max(length, j-hm.get(sum));
            } else{
                hm.put(sum, j);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(largestSarr(arr));
    }
}
