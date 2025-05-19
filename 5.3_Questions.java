class Questions {
        public static boolean isPowerOfTwo(int n){
        return (n & (n - 1)) == 0;
    }
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExponentiation(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) == 1){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(isPowerOfTwo(8)); // true

        // System.out.println(countSetBits(10)); // 2

        System.out.println(fastExponentiation(5,3));
    }
}
