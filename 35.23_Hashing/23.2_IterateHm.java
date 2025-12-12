import java.util.*;
class IterateHm {
    public static void main(String[] args){
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Australia", 120);
        hm.put("Afrika", 230);
        hm.put("China", 220);
        hm.put("America", 20);

        //iterate
        //hm.entrySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        int max = Integer.MIN_VALUE;
        String maxKey = "";
        for (String k : keys) {
            // System.out.println("Key= "+str +", value= "+ hm.get(str));
            if (max < hm.get(k)) {
                max = hm.get(k);
                maxKey = k;
            }
        }
        System.out.println(maxKey+" "+max);
        
    }
}
