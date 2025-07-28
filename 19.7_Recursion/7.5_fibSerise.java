class fibSerise {
    public static int fibSerise(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // int fnm1 = fibSerise(n - 1);
        // int fnm2 = fibSerise(n - 2);
        int fn = fibSerise(n - 1) + fibSerise(n - 2);   
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fibSerise(25));
        System.out.println(fibSerise(26));
        System.out.println(fibSerise(27));
        System.out.println(fibSerise(28));
    }
}