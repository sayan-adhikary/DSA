class ArrayAssignement {                                //tc=O(logn) sc=O(1)
        static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                // Found target
                if (nums[mid] == target) {
                    return mid;
                }
                
                // Left side is sorted
                if (nums[left] <= nums[mid]) {
                    if (target >= nums[left] && target < nums[mid]) {
                        right = mid - 1;  // Target is in left half
                    } else {
                        left = mid + 1;   // Target is in right half
                    }
                }
                // Right side is sorted
                else {
                    if (target > nums[mid] && target <= nums[right]) {
                        left = mid + 1;   // Target is in right half
                    } else {
                        right = mid - 1;  // Target is in left half
                    }
                }
            }
            
            return -1;  // Target not found
        }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 0));
    }
}
