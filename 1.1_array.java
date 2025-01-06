class array{
    // public static void main(String[] args) {
    
        //Create

        int arr[] = new int [5];
        int marks[] = {2 , 3 , 6 , 7};
        int moreMarks[] = {4 , 5 , 6};
        String fruit[] = {"Apple" , "Banana" , "Mango" , "Orange"};

        //Input
        /* marks[0] = 21;
        marks[1] = 22;
        marks[2] = 23;
        marks[3] = 24;
        System.out.println(marks[0]+" "+marks[1]+" "+marks[2]+" "+marks[3]); */

        //Passing Array using argument
        static void Update(int marks[]){

            for (int i = 0; i < marks.length; i++) {
                marks[i] = marks[i] + 1;
            }
        }

        public static void main(String[] args) {
            int []marks = {2 , 3 , 4};
            Update(marks);
            for (int i = 0; i < marks.length; i++) {
                System.out.print(marks[i]+" ");
            }
        }

        

    }
