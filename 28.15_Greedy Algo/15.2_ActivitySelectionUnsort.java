import java.util.*;

class ActivitySelectionUnsort {

    public static void activitiesUnsort(int[] start, int[] end) {   //TC-O(nlogn)
        // Structure: [ index, start, end ]
        int activities[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // index
            activities[i][1] = start[i]; // start time
            activities[i][2] = end[i]; // end time
        }

        // Sort by end time using your lambda
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // Activity Selection
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 1;

        ans.add(activities[0][0]); // add index of first selected activity
        int lastEnd = activities[0][2];

        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= lastEnd) {
                count++;
                ans.add(activities[i][0]); // original index
                lastEnd = activities[i][2];
            }
        }

        // Output
        System.out.println("Max activities = " + count);
        for (int idx : ans) {
            System.out.print("A" + idx + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        activitiesUnsort(start, end);
    }
}
