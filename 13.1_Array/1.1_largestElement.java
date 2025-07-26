class largestElement {
    static void largestElement(int []arr){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {              //TC = O(n) => loop n time
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
    }

    // return largest & smallest;
    System.out.println("Largest value: "+ largest);
    System.out.println("Smallest value: "+ smallest);
    }

    public static void main(String[] args) {
        int []number = {1,2,3,6,4,6};
        largestElement(number);
    }
}