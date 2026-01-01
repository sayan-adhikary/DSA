import java.util.Arrays;

class minAbsVal {
    
    public static int absolutePair(int[] arr1, int[] arr2) { // TC-O(nlogn)
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minval = 0;
        for (int i = 0; i < arr2.length; i++) {
            minval += Math.abs(arr1[i] - arr2[i]);
        }
        return minval;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 8, 7 };
        int[] nums2 = { 2, 3, 6, 5 };
        System.out.println(absolutePair(nums1, nums2));
    }
}
