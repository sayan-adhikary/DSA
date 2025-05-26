class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // Testing the add method with two integers
        System.out.println("Sum of 5 and 10: " + calculator.add(5, 10)); // Output: 15
        // Testing the add method with three integers   
        System.out.println("Sum of 5, 10, and 15: " + calculator.add(5, 10, 15)); // Output: 30
        // Testing the add method with two doubles
        System.out.println("Sum of 5.5 and 10.5: " + calculator.add(5.5, 10.5)); // Output: 16.0
        // Testing the add method with three doubles
        System.out.println("Sum of 5.5, 10.5, and 15.5: " + calculator.add(5.5, 10.5, 15.5)); // Output: 31.5
        // Testing the add method with mixed types
    }
}


class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method to add three doubles
    double add(double a, double b, double c) {
        return a + b + c;
    }
}