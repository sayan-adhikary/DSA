class largestString {

    static void largestString(String[] args) {                  // TC: O(n) SC: O(1)
        String largest = args[0]; // Initialize largest as first element
        for (int i = 1; i < args.length; i++) { // Loop through the array
            if (args[i].length() > largest.length()) { // If length of current element is greater than largest
                largest = args[i]; // Update largest
            }
        }
        System.out.println("Largest string: " + largest); // Print largest string
    }

    static void largeststring(String[] args) {              // TC: O(n) SC: O(1)
        String largest = args[0]; // Initialize largest as first element
        for (int i = 1; i < args.length; i++) { // Loop through the array
            if (largest.compareTo(args[i]) < 0) { // If length of current element is greater than largest
                largest = args[i]; // Update largest
                }
            }
            System.out.println("Largest string: " + largest); // Print largest string
        }
public static void main(String[] args) {
    String fruit[] = {"Apple", "Banana", "Mango", "Pineapple", "Orange"}; // Array of fruits
    largestString(fruit); // Function call
    }
}
