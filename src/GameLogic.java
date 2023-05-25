import java.util.Random;
import java.util.Scanner;

class GameLogic {
    static Random random = new Random();

    static void Step(char player) {
        Scanner scanner = new Scanner(System.in);
        int r, c;
        do {
            System.out.print("Введите номер строки от 1 до 3: ");
            r = scanner.nextInt() - 1;
            System.out.print("Введите номер столбца от 1 до 3: ");
            c = scanner.nextInt() - 1;
        } while (r < 0 || r > 2 || c < 0 || c > 2 || Field.map[r][c] != '-');
        Field.map[r][c] = player;
    }

    static void Step() {
        int r;
        int c;
        do {
            r = random.nextInt(4);
             c = random.nextInt(4);
        } while (r < 0 || r > 2 || c < 0 || c > 2 || Field.map[r][c] != '-');
        Field.map[r][c] = 'O';
    }

    static boolean ChckWin(char player) {


        for (int i = 0; i < 3; i++) {
//HV
            if (Field.map[i][0] == player && Field.map[i][1] == player && Field.map[i][2] == player) {
                return true;
            } else if (Field.map[0][i] == player && Field.map[1][i] == player && Field.map[2][i] == player)
                return true;
        }
//D
        if (Field.map[0][0] == player && Field.map[1][1] == player && Field.map[2][2] == player) {
            return true;
        } else if (Field.map[0][2] == player && Field.map[1][1] == player && Field.map[2][0] == player)
            return true;

        return false;
    }
}




