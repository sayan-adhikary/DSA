class Constractor {
    public static void main(String[] args) {
        Student s1 = new Student("Sayan");
        Student s2 = new Student(22);
        Student s3 = new Student();
    }
}

class Student {
    String name;
    int age;

Student(String name){
    System.out.println(this.name = name);
    }

Student(int age){
    System.out.println(this.age = age);
    }

Student(){
    System.out.println("Constractor called");
    }
}
// Constructor is a special method that is called when an object is created.
// It is used to initialize the object.
