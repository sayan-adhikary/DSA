import java.util.*;

// class reverseString {
//     public static void reverseStr(String str){
//         Stack<Character> s= new Stack<>();
//         for (int i = 0; i < str.length(); i++) {
//             s.push(str.charAt(i));
//         }
//         while (!s.isEmpty()) {
//             System.out.print(s.pop());
//         }

//     }
//     public static void main(String[] args) {
//         String str1 = "ABC";
//         System.out.println(str1);
//         reverseStr(str1);
//     }
// }

class reverseString {
    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseStr(str);
        System.out.println(result);
    }
}