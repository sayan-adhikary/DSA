class compression {
    static String compress(String str) {                        // TC: O(n) SC: O(n)
        StringBuilder sb = new StringBuilder(""); // Create a StringBuilder object
        int count = 1; // Initialize count as 1
        for (int i = 1; i < str.length(); i++) { // Loop through the string
            if (str.charAt(i) == str.charAt(i - 1)) { // If the current character is equal to the previous character
                count++; // Increment count
            } else { // If the current character is not equal to the previous character
                sb.append(str.charAt(i - 1)); // Append the character
                sb.append(count); // Append the count
                count = 1; // Reset count
            }
        }
        sb.append(str.charAt(str.length() - 1)); // Append the last character
        sb.append(count); // Append the count
        return sb.toString(); // Return the compressed string
    }

    static String compressed(String str) {                  // TC: O(n) SC: O(n)              
        String newStr = "";      // Initialize newStr as empty string
        for (int i = 0; i < str.length(); i++) { // Loop through the string
            Integer count = 1; // Initialize count as 1
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) { // While the current character is equal to the next character
                count++; // Increment count
                i++; // Increment i
            }
            newStr += str.charAt(i); // Append the character
            if (count > 1) { // If count is greater than 1
                newStr += count.toString(); // Append the count
            }
        }
        return newStr; // Return the compressed string
    }
    public static void main(String[] args) {
        String str = "aaabbbccc"; // String to be compressed
        System.out.println(compressed(str)); // Function call
    }
}
