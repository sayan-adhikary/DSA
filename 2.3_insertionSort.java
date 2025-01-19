class sorting {                                 //tc=O(n^2) sc=O(1)                            
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int curr = i;
            int prev = i - 1;
            //finding out the corrent pos to insert
            while (prev >= 0 && arr[prev] > arr[curr] ) {
                arr[prev + 1] = arr[prev];
                prev++;
            }
            //insertion
            arr[prev + 1] = arr[curr];
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
    }
}
