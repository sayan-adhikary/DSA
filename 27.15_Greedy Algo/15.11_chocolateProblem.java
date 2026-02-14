import java.util.*;

class chocolateProblem {
    public static void minCost(Integer costVer[], Integer costHor[], int m, int n) {
        Arrays.sort(costVer, Collections.reverseOrder());                               // Sort the vertical and horizontal cost arrays in descending order
        Arrays.sort(costHor, Collections.reverseOrder());                               // This ensures that we always consider the most expensive cut first, which is a greedy approach to minimize the total cost.

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {                              // Iterate through both cost arrays until we have processed all cuts
            if (costVer[v] <= costHor[h]) {                                             // If the current horizontal cut cost is greater than or equal to the current vertical cut cost, we choose the horizontal cut     
                cost += (costHor[h] * vp);                                              // The cost of the horizontal cut is multiplied by the number of vertical pieces (vp) because each horizontal cut will affect all vertical pieces
                hp++;
                h++;
            } else {                                                                    // If the current vertical cut cost is greater than the current horizontal cut cost, we choose the vertical cut 
                cost += (costVer[v] * hp);                                              // The cost of the vertical cut is multiplied by the number of horizontal pieces (hp) because each vertical cut will affect all horizontal pieces
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {                                                    // If there are remaining horizontal cuts, we process them
            cost += (costHor[h] * vp);                                                  // Each remaining horizontal cut will affect all vertical pieces (vp)   
            hp++;
            h++;
        }
        while (v < costVer.length) {                                                    // If there are remaining vertical cuts, we process them                        
            cost += (costVer[v] * hp);                                                  // Each remaining vertical cut will affect all horizontal pieces (hp)                             
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


/*
Input :- 
6 4
2 1 3 1 4
4 1 2

Output:
42
 */