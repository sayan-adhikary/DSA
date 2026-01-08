import java.util.*;

class largestSubarray {
    public static int largestSarr(int[] nums) {     //TC-O(n)

        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int length = 0;
        for (int j = 0; j < nums.length; j++) {
            sum+=nums[j];
            if(sum == 0){
                length = j + 1;        //0 -> j all value will be 0
            }
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
        int[] arr1 = { -31, -48, -90, 54, 20, 95, 6, -86, 22 };  //op-6  
        int[] arr2 = {-72, 68, -88, -7, 80, -80, 99, 21};   //op-7
        System.out.println(largestSarr(arr));
        System.out.println(largestSarr(arr1));
        System.out.println(largestSarr(arr2));
    }
}
