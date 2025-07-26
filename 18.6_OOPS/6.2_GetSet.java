class GetSet {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println("Pen color: " + p1.getColor());
        p1.setTip(5);
        System.out.println("Pen tip: " + p1.getTip());
        p1.setColor("Yellow");
        System.out.println("Updated Pen color: " + p1.getColor());
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    int getTip(){
        return this.tip;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}
