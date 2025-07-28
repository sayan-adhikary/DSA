class tilingProb {
    public static int tilingProb(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // choice
        // vertical
        int fnm1 = tilingProb(n - 1);
        // horizontal
        int fnm2 = tilingProb(n - 2);
        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(tilingProb(2));
    }
}
