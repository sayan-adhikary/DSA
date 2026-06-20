class Main {
    public static int sum(int n) { // 10
        // 10 + 9 + 8 + 7 + .....
        // base case
        if (n == 1) {
            return 1;
        }
        int ans = sum(n - 1);
        int ans1 = ans + n;
        return ans1;
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}