class sorting {                                 //tc=O(n^2) sc=O(1)
    static void bubbleSort(int arr[]){
        for (int turns = 0; turns < arr.length-1; turns++) {
            int swap = 0;
            for (int i = 0; i < arr.length - 1 - turns; i++) {
                if (arr[i] > arr[i + 1]) {
                    //swaping
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap ++;
                }
            }
            // System.out.println("Swap:- "+ swap);
            // if(swap == 0) break;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
