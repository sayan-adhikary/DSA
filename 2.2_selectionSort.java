class Sort {
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            if(minPos != i){
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}