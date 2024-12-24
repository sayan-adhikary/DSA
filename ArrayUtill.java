public class ArrayUtill {       //Vedio-19,20
    static void printArray(int [] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        ArrayUtil arrayUtil=new ArrayUtil();
        arrayUtil.printArray(new int[]{3,2,4,5,6,4,3,2,5});
    }
}
