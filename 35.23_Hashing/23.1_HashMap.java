import java.util.*;
class hashMap {
    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();

        //insert-O(n)
        hm.put("Sayan", 91);
        hm.put("Saurav", 95);

        System.out.println(hm);
        
        //get-O(n)
        System.out.println(hm.get("Sayan"));
        System.out.println(hm.get("Shubhankar"));

        //contains-O(n)
        System.out.println(hm.containsKey("Sayan"));
        System.out.println(hm.containsKey("Shubhankar"));

        //remove-O(n)
        // System.out.println(hm.remove("Sayan"));
        System.out.println(hm.remove("Shubhankar"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        hm.clear();                     //clear all inside the hashMap
        System.out.println(hm.isEmpty());

        System.out.println(hm);
    }
}
