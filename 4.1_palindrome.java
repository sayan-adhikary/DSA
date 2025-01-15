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

    public static void main(String[] args) {
        String str = "amlma";  // You can change the string for testing
        checkPalindrome(str);
    }
}
