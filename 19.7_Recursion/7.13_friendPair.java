class friendPair {
    public static int friendPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // single
        int fnm1 = friendPair(n - 1);

        // pair
        int fnm2 = friendPair(n - 2);
        int paireways = (n - 1) * fnm2;

        // totalways
        int totalways = fnm1 + paireways;
        return totalways;
        // return friendPair(n - 1) + (n - 1) * friendPair(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendPair(3));
    }
}
