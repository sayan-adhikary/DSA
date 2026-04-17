import java.util.*;

class reverseStack {    //tc: O(n^2) sc: O(n)
    public static void pushAtBottom(Stack<Integer> s, int data) {       // Bottom wala push
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop(); // 3,2,1
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStc(Stack<Integer> s) {       // Stack ko reverse karne ke liye
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStc(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {       // Stack ko print karne ke liye
        // while(!s.empty()) {
        // System.out.print(s.pop());
        // }
        System.out.println(s); // yeh stack ko print kar dega without pop
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        printStack(s); // 3 2 1
        reverseStc(s);
        printStack(s); // 1 2 3
    }
}
