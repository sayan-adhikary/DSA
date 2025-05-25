class inheritance {
    public static void main(String[] args) {
        Fish Sarkar = new Fish();
        Sarkar.eat();
        Sarkar.breath();
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

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}
