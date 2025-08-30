import java.util.*;
class Container_With_Rain_Water {
    
    static int storeWater(ArrayList<Integer> List){
        int maxWater = 0;
        for (int i = 0; i < List.size(); i++) {
            for (int j = i+1; j < List.size(); j++) {
                int width = j-i;
                int height = Math.min(List.get(i), List.get(j));
                int currWater = width * height;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        // List<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}