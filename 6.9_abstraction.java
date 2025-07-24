class abstraction {
    public static void main(String[] args) {
        
    }
}

abstract class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
    abstract void walk();
}

class horse extends Animal{
    void walk(){
        System.out.println("Horse is walking");
    }
}

class chicken extends Animal{
    void walk(){
        System.out.println("Chicken is walking");
    }
}