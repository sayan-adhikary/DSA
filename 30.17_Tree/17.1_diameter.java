class solution {
    static class Node { //backbone of the tree 
        int data;
        Node left;
        Node right;

        Node(int data) {    
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // static class info { //class to store diameter and height of a node
    //     int diameter;
    //     int height;

    //     info(int dm, int ht) {
    //         this.diameter = dm;
    //         this.height = ht;
    //     }
    // }

    public static int height(Node root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diaMeter(Node root) { // Approach 1 TC-O(n^2)
        if (root == null)
            return 0;

        int leftDiameter = diaMeter(root.left);
        int rightDiameter = diaMeter(root.right);
        int leftHight = height(root.left);
        int rightHight = height(root.right);
        int selfDiameter = leftHight + rightHight + 1;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    // public static info diaMeterOf(Node root) {  // Approach 2 TC-O(n)
    //     if (root == null)
    //         return new info(0, 0);

    //     info leftInfo = diaMeterOf(root.left);      //left subtree info
    //     info rightInfo = diaMeterOf(root.right);    //right subtree info

    //     int diam = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);   //diameter of left subtree, diameter of right subtree, diameter of current node

    //     int finalHt = Math.max(leftInfo.height, rightInfo.height) + 1;  //height of current node

    //     return new info(diam, finalHt); //returning diameter and height of current node
    // }

     public static void main(String[] args) {
        /*
         *      1 -> level 1
         *     / \
         *    2   3 -> level 2
         *   / \ / \
         *  4  5 6  7 -> level 3
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(height(root));

        System.out.println(diaMeter(root));

        // System.out.println(diaMeterOf(root).diameter);
        // System.out.println(diaMeterOf(root).height);
    }
}
