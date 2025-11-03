import java.util.*;

public class MergeLLFramework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Original List: " + list); // Sort using Java framework (Collections)
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        sc.close();
    }
}
