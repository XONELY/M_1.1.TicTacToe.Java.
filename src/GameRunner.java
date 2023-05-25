public class GameRunner {

    static final char p1 = 'X';
    static final char p2 = 'O';
    static boolean pState = GameLogic.random.nextBoolean() ;

    public static void main(String[] args) {
        Field.LoadMap();
        Field.PrintMap();
        Start();
    }

    static void Start() {
        while (true) {
            char currentPlayer = pState ? p1 : p2;
            System.out.println("Ход игрока: "+currentPlayer);
            if (currentPlayer == 'O'){
                GameLogic.Step();
                Field.PrintMap();
                if (GameLogic.ChckWin(currentPlayer)) {
                    System.out.println("Победил: " + currentPlayer);
                    break;
                }
                if (Field.CheckBoard()) {
                    System.out.println("Ничья");
                    break;
                } pState = !pState;
            } else{
                GameLogic.Step(currentPlayer);
                Field.PrintMap();
                if (GameLogic.ChckWin(currentPlayer)) {
                    System.out.println("Победил: " + currentPlayer);
                    break;
                }
                if (Field.CheckBoard()) {
                    System.out.println("Ничья");
                    break;
                } pState = !pState;
            }
        }
    }
 /* "мультиплеер"
     static void Start() {
        while (true) {
            char currentPlayer = pState ? p1 : p2;
            GameLogic.Step(currentPlayer);
            Field.PrintMap();
            if (GameLogic.ChckWin(currentPlayer)) {
                System.out.println("Победил: " + currentPlayer);
                break;
            }
            if (Field.CheckBoard()) {
                System.out.println("Ничья");
                break;
            } pState = !pState;
        }*/
}