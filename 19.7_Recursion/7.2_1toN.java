class print{
    public static void  printIncrese(int n, int m){
        if(m == 100){                       //if(m > n) ##this is also working    -> this is the ##Base Case
            System.out.print(m);
            return;
        }
        System.out.print(m +" ");
         printIncrese(n,m+1);
    }

    public static void printInc(int n){         //new Idea
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        //  printIncrese(100,1);
        printInc(10);
    }
}