public class subArraySum {
        static void subArraySum(int arr[]){
            int TN = 0;
            //int currentSum = 0;
            for (int i = 0; i < arr.length; i++) {              
                int start = i;
                for (int j = start; j < arr.length; j++) {
                    int end = j;
                    int currentSum = 0;
                    for (int k = start; k <= end; k++) {
                         currentSum += arr[k];
                    }
                    System.out.print(currentSum);
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

