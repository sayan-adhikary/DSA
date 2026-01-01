import java.util.Arrays;
import java.util.Comparator;

class maxLengthChain {

    public static int maxLength(int[][] arr) {  //TC-O(nlogn)
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));

        int ans = 1;
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] >= end) {
                ans++;
                end = arr[i][1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] pair = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        System.out.println(maxLength(pair));
    }
}
