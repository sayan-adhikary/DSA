class Palindrome {                                      //Both methods TC: O(n) SC: O(1)
    static void checkPalindrome(String str) {           // Function to check palindrome
        int start = 0;                        // Start index
        int end = str.length() - 1;             // End index

        // Loop to compare characters from both ends
        while (start < end) {              // While start is less than end
            if (str.charAt(start) != str.charAt(end)) {     // If characters are not equal
                System.out.println("Not Palindrome");           // Print Not Palindrome
                return;  // No need to check further if it's already not a palindrome
            }
            start++;                                        // Increment start
            end--;                                        // Decrement end                          
        }                                                   // End of loop
        // If the loop completes, it's a palindrome
        System.out.println("Palindrome");                   // Print Palindrome
    }

    static boolean palindrome(String str){              // Function to check palindrome
       for(int i = 0; i < str.length()/2; i++) {        // Loop to compare characters from both ends
        int n = str.length();                       // Length of string
        if (str.charAt(i) != str.charAt(n - i - 1)) {       // If characters are not equal
            return false;  // No need to check further if it's already not a palindrome
        }
        }
        return true;                                    // If the loop completes, it's a palindrome
    }
    public static void main(String[] args) {                // Main method
        String str = "amltma";  // You can change the string for testing
        // checkPalindrome(str);
        System.out.println(palindrome(str));        // Function call
    }
}
