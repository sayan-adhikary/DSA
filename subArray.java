public class subArray {
    static void subArray(int arr[]){
        int TN = 0;
        for (int i = 0; i < arr.length; i++) {                  //loop run till arr.length
            int start = i;
            for (int j = start; j < arr.length; j++) {          //loop run till arr.length
                int end = j;
                for (int k = start; k <= end; k++) {            //loop run Start => end
                    System.out.print(arr[k]+" ");
                }
                TN++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Number: "+ TN);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        subArray(number);
    }
} 