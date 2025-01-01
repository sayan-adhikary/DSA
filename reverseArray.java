public class reverseAArray {
    static void reverseAArray(int arr[]){
        int start = 0;
        int last = arr.length-1;
        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
    }
    public static void main(String[] args) {
        int number[] = {2,6,7,8,9,10};
        reverseAArray(number);

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
    }
}
