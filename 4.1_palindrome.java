class Palindrome {
    static void checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Loop to compare characters from both ends
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println("Not Palindrome");
                return;  // No need to check further if it's already not a palindrome
            }
            start++;
            end--;
        }
        // If the loop completes, it's a palindrome
        System.out.println("Palindrome");
    }

    static boolean palindrome(String str){
       for(int i = 0; i < str.length()/2; i++) {
        int n = str.length();
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;  // No need to check further if it's already not a palindrome
        }
         }
        return true;
    }
    public static void main(String[] args) {
        String str = "amltma";  // You can change the string for testing
        // checkPalindrome(str);
        System.out.println(palindrome(str));
    }
}
