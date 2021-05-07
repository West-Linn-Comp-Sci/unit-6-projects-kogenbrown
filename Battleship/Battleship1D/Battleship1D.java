import java.util.Random;

public class Battleship1D {
    private int[] board;
    private int guesses, hits, boatSize;
    private boolean gameOver = false;
    Random rand = new Random();
    public Battleship1D(int length) {
        this.board = new int[length];
    }
    public void init() {
        for(int i = 0; i < this.board.length; i++) {
            this.board[i]=0;
        }
        printBoard();
    }
    public void placeShip(int size) {
        int startingPoint = rand.nextInt(this.board.length-size);
        this.boatSize=size;
        for(int i = startingPoint; i < startingPoint + size; i++) {
            this.board[i] = 1;
        }
    }
    /*
    0 means empty space that has not been guessed
    1 means occupied space that has not been guessed
    2 means space that was guessed and a "miss"
    3 means space that was guessed and a "hit"
     */
    public void printBoard() {
        System.out.print("-----------------\n| ");
        for(int i : this.board) {
            if(i==0||i==1) {
                System.out.print("? ");
            } else if(i==2) {
                System.out.print("O ");
            } else if(i==3) {
                System.out.print("X ");
            }
        }
        System.out.println("|\n-----------------");
    }
    public void guess(int guess) {
        if(guess >= 0 && guess < this.board.length) {
            if(this.board[guess]==0) {
                this.board[guess] = 2;
                System.out.println("Miss!");
                guesses++;
                printBoard();
            } else if(this.board[guess]==1) {
                this.board[guess] = 3;
                System.out.println("Hit!");
                guesses++;
                hits++;
                printBoard();
                if(hits==this.boatSize) {
                    endGame();
                }
            } else System.out.println("This index has already been revealed, please guess again.");
        } else System.out.println("Index out of bounds, guess again.");
    }
    public boolean getGameState() {
        return !gameOver;
    }
    public void endGame() {
        System.out.println("You win");
        System.out.print("Rating: [");
        int rating =(int) (((double) hits/guesses) * 20);
        for (int i = 0; i < 20; i++) {
            if(i <= rating)
                System.out.print("#");
            else
                System.out.print("-");
        }
        System.out.println("] (" + ((double) hits/guesses)*100 + "%)" );
        gameOver=true;
    }
}