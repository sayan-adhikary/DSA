import java.util.*;

class MaxAreHistogram {

    public static int maxArea(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                int height = arr[st.pop()];
                int width;
                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int height = arr[st.pop()];
            int width;
            if (st.isEmpty()) {
                width = arr.length;
            } else {
                width = arr.length - st.peek() - 1;
            }
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static int maxArea2(int arr[]) {     //tc = O(n) sc = O(n)
        int maxArea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        //next smaller to right
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = st.peek();
            }
            st.push(i);
        }

        //next smaller to left
        st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }

        // Current Area = j - i - 1 = nsr[i] - nsl[i] - 1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea2(arr));
    }
}
