public class subArraySum {
        static void subArraySum(int arr[]){
            int max = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int i = 0; i < arr.length; i++) {              
                int start = i;
                for (int j = start; j < arr.length; j++) {
                    int end = j;
                    currentSum = 0;
                    for (int k = start; k <= end; k++) {
                         currentSum += arr[k];
                    }
                    System.out.println(currentSum);
                if (max<currentSum) {
                    max = currentSum;
                }
            }
        }
        System.out.println("MAX VALUE: "+ max);
    }
        public static void main(String[] args) {
            int number[] = {2,4,6,8,10};
            subArraySum(number);
        }
    } 

