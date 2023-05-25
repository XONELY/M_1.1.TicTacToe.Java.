public class Field {



    static char[][] map = new char[3][3];


public static void LoadMap(){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            Field.map[i][j] = '-';
        }
    }
}
    public static void PrintMap() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(Field.map[i][j] + " ");
            }
            System.out.println();
        }
    }




    public static boolean CheckBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
