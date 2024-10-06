import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerA = getPlayerMove(scanner, "Player A");
        String playerB = getPlayerMove(scanner, "Player B");

        System.out.println("Player A chose: " + playerA);
        System.out.println("Player B chose: " + playerB);

        displayResult(playerA, playerB);
    }

    public static String getPlayerMove(Scanner scanner, String playerName) {
        String move;
        while (true) {
            System.out.print(playerName + ", enter your move (R, P, S): ");
            move = scanner.nextLine().trim();
            if (move.equalsIgnoreCase("R") || move.equalsIgnoreCase("P") || move.equalsIgnoreCase("S")) {
                break;
            }
            System.out.println("Invalid move! Please enter R, P, or S.");
        }
        return move.toUpperCase(); // Convert to uppercase for consistency in results
    }

    public static void displayResult(String moveA, String moveB) {
        if (moveA.equals(moveB)) {
            System.out.println("It's a tie!");
        } else if ((moveA.equals("R") && moveB.equals("S")) ||
                (moveA.equals("P") && moveB.equals("R")) ||
                (moveA.equals("S") && moveB.equals("P"))) {
            System.out.println("Rock breaks Scissors, Player A wins!");
        } else {
            System.out.println("Paper covers Rock, Player B wins!");
        }
    }
}

