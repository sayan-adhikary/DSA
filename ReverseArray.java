public class ReverseArray {
static void printArray(int[] array){
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]+" ");
    }
    System.out.println();
}

static void reverse(int[] arr,int start,int end){
    while (start<end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}
    public static void main(String[] args) {
        int[] numbers={2,3,2,4,5,6};
        printArray(numbers);
        reverse(numbers, 0, numbers.length-1);
        printArray(numbers);
    }
}
