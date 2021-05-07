import java.util.Scanner;

public class Battleship1DClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Battleship1D game = new Battleship1D(7);
        game.init();
        game.placeShip(3);
        for (int i = 0; i < 7; i++) {
            game.guess(i);
            if(!game.getGameState()) break;
        }
    }
}