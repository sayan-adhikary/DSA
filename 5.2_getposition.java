class getposition {
    public static void getposition(int n, int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0) {
            System.out.println("0");
        } else{
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        getposition(5, 3); // 0
        getposition(5, 2); // 0
        getposition(5, 1); // 1
        getposition(5, 0); // 1
    }
}
