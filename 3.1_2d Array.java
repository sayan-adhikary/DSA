import java.util.*;
class TwoDArray{
    static boolean search(int[][] arr , int a){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (a == arr[i][j]) {
                    System.out.println("Array found index: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] =new int [4][3];            //cell:- n x m
        Scanner sc = new Scanner(System.in);
        int n = arr.length, m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(arr[i][j]+" ");;
            }
            System.out.println();
        }
        search(arr, 5);
    }
}