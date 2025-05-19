class evenOdd {
    public static void printNumber(int n){
        int bitmask = 1;
        if((n & bitmask) == 0) {
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        printNumber(8); 
        printNumber(81); 
        printNumber(5); 
        printNumber(3); 
    }
}
