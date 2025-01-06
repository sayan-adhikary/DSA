class linearsearch {
    public static int liniarshearch(int numbers[],int key){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,8,9};
        int key = 17;
        int index = liniarshearch(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key index is: "+ index);
        }
    }
}