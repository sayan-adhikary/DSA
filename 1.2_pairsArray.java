class pairsArray {                              //tc=O(n^2) sc=O(1)
    static void pairsArray(int arr[]){
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
                tp++;
            }
            System.out.println();
        }
    System.out.println("Total Pairs: "+tp);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        pairsArray(number);
    }
}
