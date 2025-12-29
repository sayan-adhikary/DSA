import java.util.*;
import java.util.HashMap;

class itenaryTicket {
    public static String startingP(Map<String, String> hm) {

        Map<String, String> revMap = new HashMap<>();

        // for (String key : hm.keySet()) {
        // revMap.put(hm.get(key), key);
        // }

        for (Map.Entry<String, String> entry : hm.entrySet()) {
            revMap.put(entry.getValue(), entry.getKey());
        }

        for (String key : hm.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void ticket(Map<String, String> tickets){
        String start = startingP(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bangalore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        ticket(tickets);
    }
}