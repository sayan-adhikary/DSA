class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sayan";
        s1.roll = 122;
        s1.password = "Sayan123";
        s1.marks[0] = 90;
        s1.marks[1] = 80;   
        s1.marks[2] = 70;

        // Copy constructor
        Student s2 = new Student(s1);
        s2.password = "Adhikary123";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks of s1: " + s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow Copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Default constructor
    Student() {
        marks = new int[3];
        System.out.println("Constractor is called...");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}