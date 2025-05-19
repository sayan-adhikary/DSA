class getposition {
    public static void printBitAtPosition(int n, int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0) {
            System.out.println("0");
        } else{
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        printBitAtPosition(5, 3); // 0
        printBitAtPosition(5, 2); // 0
        printBitAtPosition(5, 1); // 1
        printBitAtPosition(5, 0); // 1
    }
}
