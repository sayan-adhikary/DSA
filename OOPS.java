public class OOPS{
    public static void main(String[] args) {
        pen p1 = new pen(); // Creating an object of pen class called p1
        p1.setColor("Blue"); // Setting color of pen
        p1.setTip(5); // Setting tip of pen
        System.out.println("Pen color: " + p1.color); // Printing color of pen
        System.out.println("Pen tip: " + p1.tip); // Printing tip of pen
        // p1.setColor("Yellow"); // Changing color of pen
        p1.color = "Yellow"; // Changing color of pen
        System.out.println("Updated Pen color: " + p1.color); // Printing updated color of pen

        BankAccount account = new BankAccount(); // Creating an object of BankAccount class
        account.username = "user123"; // Setting username
        account.setPassword("Sayan123"); // Setting password
        System.out.println("Username: " + account.username); // Printing username
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String newPassword){
        password = newPassword;
    }
}

class pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class student{
    String name;
    int age;
    int percentage;

    void calcPercentage(int physics, int chemistry, int maths){
        percentage = (physics + chemistry + maths) / 3;
    }
}