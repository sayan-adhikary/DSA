class diagonalSum {
    static int diagonalSum(int[][] arr){
        int sum = 0;
        // for (int i = 0; i < arr.length; i++) {               // TC:- O(n^2)
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if (i == j) {
        //             sum += arr[i][j];
        //         }
        //         if (i + j == arr.length - 1) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }


        for (int i = 0; i < arr.length; i++) {              //TC:- O(n)
            //pd
            sum += arr[i][i];
            //sd
            if (i != arr.length - 1 - i) {
                sum += arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(arr));
    }
}
