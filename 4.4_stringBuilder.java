class stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");   // Create a StringBuilder object
        for(char ch = 'a'; ch <= 'z'; ch++){            //TC: O(n) SC: O(1)
            str.append(ch);                        // Append alphabets to the StringBuilder
        }
        System.out.println(str);                  // Print the StringBuilder
        // System.out.println(str.reverse());        // Print the reversed StringBuilder
        // System.out.println(str.length());      // Delete characters from index 0 to 5
    }
}
