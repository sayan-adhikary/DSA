class Main{
    public static void print(String s1, int count){
        // if(count == 10) return;
        System.out.println(s1 + " is printing");
        print(s1,count+1);
    }
    
    public static void main(String[] args) {
        print("Sayan",0);
    }
}