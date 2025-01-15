class shortestPath {                                // TC: O(n) SC: O(1)
    static double shortestPath(String str){
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'N') {                       // If direction is North
                y++;
            } else if (dir == 'S') {                // If direction is South
                y--;
            } else if (dir == 'E') {                // If direction is East
                x++;
            } else if (dir == 'W') {                // If direction is West
                x--;
            }
        }
        return Math.sqrt(x*x + y*y);           // Return the shortest path
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";  // You can change the string for testing
        System.out.println(shortestPath(str));        // Function call
    }
}
