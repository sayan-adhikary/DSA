class binarySearch {
    public static int binarySearch(int []arr,int key){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end)/2;
            if (arr[mid] == key) {
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
            if(arr[mid] > key){
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []number = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println(binarySearch(number, key));
    }
}