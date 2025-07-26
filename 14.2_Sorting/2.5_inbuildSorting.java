import java.util.Arrays;
import java.util.Collections;

class inbuildSorting {              //tc=O(nlogn) sc=O(1)
    public static void main(String[] args) {
        Integer arr[] = {5,3,5,2,8,9,2,1};
        Arrays.sort(arr);                                    //o/p:- 1 2 2 3 5 5 8 9 
        // Arrays.sort(arr,0,3);                                //o/p:- 3 5 5 2 8 9 2 1
        // Arrays.sort(arr,Collections.reverseOrder());         //o/p:- 9 8 5 5 3 2 2 1 
        // Arrays.sort(arr,0,3,Collections.reverseOrder());     //o/p:- 5 5 3 2 8 9 2 1
        for (Integer i : arr) {
            System.out.print(i+" ");
        }
    }
}
