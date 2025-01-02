public class subArray {
    static void subArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        subArray(number);
    }
} 