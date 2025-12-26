import java.util.*;

class validAnagram {
    public static boolean valid(String s, String t) {

        if (s.length()!=t.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        // string s
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            hm.put(key, hm.getOrDefault(key, 0) + 1);
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
        return hm.isEmpty();    //TC-O(n)
    }

    public static void main(String[] args) {
        String str1 = "RACE";
        String str2 = "RACE";
        System.out.println(valid(str1, str2));
    }
}