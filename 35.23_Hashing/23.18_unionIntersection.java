import java.util.*;

class unionIntersection {

    public static int Union(int[] arr1, int[] arr2) {   //TC-O(n)
        Set<Integer> hs1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs1.add(arr2[i]);
        }
        return hs1.size();
    }

    public static int Intersection(int[] arr1, int[] arr2) {
        Set<Integer> hs2 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs2.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (hs2.contains(arr2[i])) {
                hs2.remove(arr2[i]);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = { 7, 3, 9 };
        int[] nums2 = { 6, 3, 9, 2, 4 };
        System.out.println(Union(nums1, nums2));
        System.out.println(Intersection(nums1, nums2));
    }
}
