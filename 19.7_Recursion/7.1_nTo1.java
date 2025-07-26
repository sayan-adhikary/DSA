class  Solution {
    static void printDec(int n){
        if(n == 1) {                //Base Case -> Which will end the program
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void main(String[] args) {
        printDec(100);
    }
}