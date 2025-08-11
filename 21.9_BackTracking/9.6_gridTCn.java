class GridWays {

    // Main function to calculate number of ways from (i, j) to (n-1, m-1)
    public static int gridWays(int i, int j, int n, int m) {
        int down = n - i - 1;  // number of down moves needed
        int right = m - j - 1; // number of right moves needed
        if (down < 0 || right < 0) return 0;
        return (int) nCr(down + right, down);
    }
    // Function to calculate nCr (combinations) efficiently using multiplicative formula
    public static long nCr(int n, int r) {
        if (r > n - r) {
            r = n - r; // Use symmetry property C(n, r) = C(n, n - r)
        }

        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }

    // Example test case
    public static void main(String[] args) {
        int n = 3; // rows
        int m = 3; // columns
        int i = 0; // starting row
        int j = 0; // starting column

        int ways = gridWays(i, j, n, m);
        System.out.println("Number of grid ways from (" + i + ", " + j + ") to (" + (n-1) + ", " + (m-1) + "): " + ways);
    }
}