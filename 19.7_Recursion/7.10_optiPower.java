class optiPower {
    public static int optiPower(int a, int n) {         //TC=O(logn)
        if (n == 0) {
            return 1;
        }
        int halfPow = optiPower(a, n / 2);
        int halfPowSq = halfPow * halfPow;
        if (n % 2 != 0) {
            halfPowSq = a * halfPowSq;
        }
        return halfPowSq;
    }

    public static void main(String[] args) {
        System.out.println(optiPower(2, 10));
    }
}
