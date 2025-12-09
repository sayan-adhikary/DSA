import java.util.*;
class IterateHm {
    public static void main(String[] args){
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Australia", 120);
        hm.put("Afrika", 130);
        hm.put("China", 220);
        hm.put("America", 20);

        //iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String str : keys) {
            System.out.println("Key= "+str +", value= "+ hm.get(str));
        }
        
    }
}
