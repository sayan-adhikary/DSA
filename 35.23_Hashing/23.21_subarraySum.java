import java.util.*;
class subarraySum {
    public static int subarSum(int[] arr, int k){   //TC-O(n)
        int sum = 0, ans = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];    //sum(j)
            if(hm.containsKey(sum - k)){
                ans+=hm.get(sum - k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={10,2,-2,-20,10};
        int k = -10;
        System.out.println(subarSum(nums, k));
    }
}
