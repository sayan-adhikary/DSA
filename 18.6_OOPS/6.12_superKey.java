class superKey {
    public static void main(String[] args) {
        Horse h = new Horse();
        
    }
}

class Animal{
    Animal(){
        System.out.println("animal construnctor is called");
    }
}

class Horse extends Animal {
    Horse(){
        super();
        System.out.println("horse constructor called");
    }
}