import java.util.*;

class DuplicateParanthasis {
    public static boolean duplicateParanthesis(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    return true;
                } else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        return false;
    }

    public static boolean duplicateParanthesis2(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (st.peek() != '(') {
                    st.pop();
                    count++;
                }
                st.pop();
                if (count == 0) {
                    return true;
                }
            } else {
                st.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "{((a+k)+(b+p))}";
        System.out.println(duplicateParanthesis(str));
        System.out.println(duplicateParanthesis2(str));
    }
}
/*
We can use count variable when we pop
if we get count 0 then we have duplicate paranthesis
*/