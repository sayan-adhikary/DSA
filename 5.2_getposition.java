class getposition {
    public static int getIthBit(int n, int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0) {
            return 0;
        } else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitmask = 1 << i;
        int newNumber = n | bitmask;
        return newNumber;
    }

    public static int clearIthBit(int n, int i){
        int bitmask = 1 << i;
        int newNumber = n & ~bitmask;
        return newNumber;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if (newBit == 0) {
        //     clearIthBit(n, i);
        // } else {
        //     setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }

    public static int clearLastIbits(int n, int i){
        int bitmask = (-1) << i;
        return n & bitmask;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        // getIthBit(5, 3); // 0
        // getIthBit(5, 2); // 0
        // getIthBit(5, 1); // 1
        // getIthBit(5, 0); // 1

        // setIthBit(5, 1); // 7
        // setIthBit(5, 2); // 5

        // clearIthBit(5, 1); // 4
        // clearIthBit(10, 1); // 8
        // clearIthBit(10, 2); // 10

        // System.out.println(updateIthBit(14, 1, 0)); // 5 -> 4
        // System.out.println(updateIthBit(5, 1, 1)); // 5 -> 7

        // System.out.println(clearLastIbits(15, 2)); // 12
        // System.out.println(clearLastIbits(15, 3)); // 8
    }
}
