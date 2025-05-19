class getposition {
    public static void getIthBit(int n, int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0) {
            System.out.println("0");
        } else{
            System.out.println("1");
        }
    }

    public static void setIthBit(int n, int i){
        int bitmask = 1 << i;
        int newNumber = n | bitmask;
        System.out.println(newNumber);
    }

    public static void clearIthBit(int n, int i){
        int bitmask = 1 << i;
        int newNumber = n & ~bitmask;
        System.out.println(newNumber);
    }

    public static void main(String[] args) {
        getIthBit(5, 3); // 0
        getIthBit(5, 2); // 0
        getIthBit(5, 1); // 1
        getIthBit(5, 0); // 1

        setIthBit(5, 1); // 7
        setIthBit(5, 2); // 5

        clearIthBit(5, 1); // 4
        clearIthBit(10, 1); // 1
    }
}
