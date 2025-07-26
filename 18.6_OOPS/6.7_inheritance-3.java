class inheritanceHierarchial{
    public static void main(String[] args) {
        //we can add any of the given below(mammal, fish, bird)
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breath");
    }
}

class Mammal extends Animal{
    int legs;
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}