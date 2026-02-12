import java.util.*;

class chocolateProblem {
    public static void minCost(Integer costVer[], Integer costHor[], int m, int n) {
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) {
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println(cost);
    }

    public static void main(String[] args) {
        // int n = 4, m = 6;
        // Integer costVer[] = { 2, 1, 3, 1, 4 };
        // Integer costHor[] = { 4, 1, 2 };
        // minCost(costVer, costHor, m, n);
         Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();  // columns
        int n = sc.nextInt();  // rows

        Integer[] costVer = new Integer[m - 1];
        Integer[] costHor = new Integer[n - 1];

        for (int i = 0; i < m - 1; i++) {
            costVer[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            costHor[i] = sc.nextInt();
        }
        minCost(costVer, costHor, m, n);
    }
}
