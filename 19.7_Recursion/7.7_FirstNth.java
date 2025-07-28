class FirstNth {
    public static int firstOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,3,5,6};
        System.out.println(firstOccurence(arr, 5, 0));
    }
}
