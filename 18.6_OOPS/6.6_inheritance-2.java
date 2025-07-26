class inheritanceMultilevel {
    public static void main(String[] args) {
        Dog supratim = new Dog();
        supratim.eat();
        supratim.legs = 4;
        System.out.println(supratim.legs);
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

class Dog extends Mammal{
    int breed;
}
