import java.util.*;
class array{                                      //tc=O(n) sc=O(n)                     //tc=O(nlogn) sc=O(1)
    public static boolean containsDuplicate(int[] nums) {
            // Sort the array first
            Arrays.sort(nums);
            
            // Check adjacent elements for duplicates
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i-1]) {
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        int []nums = {1,2,3,1,2};
        System.out.println(containsDuplicate(nums));
    }
}
