import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerAMove = "";
        String playerBMove = "";
        String trash = "";
        String playAgain = "";
        boolean done = false;
        boolean done2 = false;
        boolean done3 = false;
        boolean donePlay = false;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        do {
            done = false;
            done2 = false;
            done3= false;
            do {
                System.out.println("Player A choose your move! (R,P,S)");
                playerAMove = in.next().toUpperCase();
                switch (playerAMove) {
                    case "R":
                    case "P":
                    case "S":
                        done = true;
                        break;
                    default:
                        System.out.println("Invalid move! Please choose R, P, or S.");
                        trash = playerAMove;

                }
            } while (!done);

            do {
                System.out.println("Player B choose your move! (R,P,S)");
                playerBMove = in.next().toUpperCase();
                switch (playerBMove) {
                    case "R":
                    case "P":
                    case "S":
                        done2 = true;
                        break;
                    default:
                        System.out.println("Invalid move! Please choose R, P, or S.");
                        trash = playerBMove;

                }
            } while (!done2);
            if (playerAMove.equals("R")) {
                if (playerBMove.equals("R")) {
                    System.out.println("Its a tie!");
                } else if (playerBMove.equals("P")) {
                    System.out.println("Paper beats Rock, Player B wins!");
                } else if (playerBMove.equals("S")) {
                    System.out.println("Rock beats Scissors, Player A wins!");
                }
            }
            if (playerAMove.equals("P")) {
                if (playerBMove.equals("P")) {
                    System.out.println("Its a tie!");
                } else if (playerBMove.equals("R")) {
                    System.out.println("Paper beats Rock, Player A wins!");
                } else if (playerBMove.equals("S")) {
                    System.out.println("Rock beats Scissors, Player B wins!");
                }
            }
            if (playerAMove.equals("S"))
                if (playerBMove.equals("S")) {
                    System.out.println("Its a tie!");
                } else if (playerBMove.equals("P")) {
                    System.out.println("Scissors cuts paper, Player A wins!");
                } else if (playerBMove.equals("R")) {
                    System.out.println("Rock beats Scissors, Player B wins!");
                }
            do
            {
                System.out.println("Would you like to continue playing? (Y/N)");
                playAgain = in.next().toUpperCase();
                switch (playAgain)
                {
                    case "N":
                        done3 = true;
                        donePlay = true;
                        break;
                    case "Y":
                        done3 = true;
                        break;
                    default:
                        System.out.println("Invalid choice! Please choose Y or N");

                }
            }while (!done3);
        }while (!donePlay);
    }
}
