import java.util.*;

class pareSum1 {

    //brute force   O(n^2)
    static boolean sum(ArrayList<Integer> List, int target){
        for (int i = 0; i < List.size(); i++) {
            for (int j = i+1; j < List.size(); j++) {
                if(List.get(i)+List.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    //Optimized Approach O(n)
    static boolean sum1(ArrayList<Integer> list, int target){
        int lp = 0, rp = list.size()-1;
        while(lp!= rp){
            //case1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            //case2
            
            else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            //case3
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        height.add(7);
        height.add(8);
        height.add(9);
        System.out.println(sum1(height, 5));
    }
}
