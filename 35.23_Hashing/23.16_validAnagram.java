import java.util.*;

class validAnagram {
    public static boolean valid(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // string s
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        // string t
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (hm.containsKey(key)) {
                if (hm.get(key) == 1) {
                    hm.remove(key);
                } else {
                    hm.put(key, hm.get(key) - 1);
                }
            } else {
                return false;
            }
        }
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "RACE";
        String str2 = "CARE";
        System.out.println(valid(str1, str2));
    }
}