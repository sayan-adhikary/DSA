class upperCase {
    public static String toUpper(String str) {
        StringBuilder sb = new StringBuilder("");   // Create a StringBuilder object

        char ch = Character.toUpperCase(str.charAt(0)); // Convert the first character to uppercase
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length() - 1) { // If the character is a space
                sb.append(str.charAt(i));   // Append the space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // Convert the next character to uppercase
            } else {
                sb.append(str.charAt(i)); // Append the character as it is
            }
        }
    return sb.toString(); // Return the final string
}
    public static void main(String[] args) {
        String str = "hello world";  // You can change the string for testing
        System.out.println(toUpper(str));        // Function call
    }
}
