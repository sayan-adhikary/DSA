class subArraySum1 {                                        //tc=O(n^3) sc=O(1)

    //Brute Force                                                       3type explaination are their
    public static void subArraySum1(int arr[]){
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

    //Prefix Sum
    public static void subArraySum2(int arr[]){
        int max = Integer.MIN_VALUE;
        int prefixArray[] = new int[arr.length];
        int currentSum = 0;

        prefixArray[0] = arr[0];
        //array calculation for prefixArray
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {              
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[start - 1];    //current sum = 0 then print prefix[end] Otherwise prefix[end] - prefix[start - 1]
                
                if (max<currentSum) {
                max = currentSum;
                    }
                }
            }
        System.out.println("MAX VALUE: "+ max);
    }

    //Kadanes Algorithm
public static void subArraySum3(int arr[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
        if (cs < 0){
            cs = 0;
        }
        ms = Math.max(ms, cs);
        }
    System.out.println("Max Value: "+ ms);
}
        public static void main(String[] args) {
            int number[] = {-2,-3,4,-1,-2,1,5,-3};
            subArraySum3(number);
        }
}

