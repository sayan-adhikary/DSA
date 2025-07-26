class inteface {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();
    }
}

interface ChassPlayer{
    void moves();
}

class Queen implements ChassPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal()");
    }
}

class Rook implements ChassPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}