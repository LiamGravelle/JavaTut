import java.util.Scanner;

public class Nim {

  public static void main(String[] args) {

    int pileSize = 100;

    Scanner input = new Scanner(System.in);
    int userGuess;

    //true means cpu turn
    boolean turn;

    if (Math.random() >= 0.5) {
      turn = true;
    } else {
      turn = false;
    }

    while (pileSize > 1) {
      System.out.println("marbles left: " + pileSize );
      if (turn) {
        System.out.println("Computer's turn");
        pileSize -= Math.random() * (pileSize/2) + 1;
      } else {
        System.out.println("guess");
        userGuess = input.nextInt();
        pileSize -= userGuess;
      }

      turn = !turn;
    }

    //report who wins
    if (turn) {
      System.out.println("Human wins");
    } else {
      System.out.println("Computer wins");
    }
  }
}
