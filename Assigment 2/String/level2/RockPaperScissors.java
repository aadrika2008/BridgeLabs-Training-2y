package com.gla.String.level2;
import java.util.*;

public class RockPaperScissors {    static String computerChoice() {

    int choice = (int)(Math.random() * 3);

    if (choice == 0)
        return "Rock";
    else if (choice == 1)
        return "Paper";
    else
        return "Scissors";
}

    static String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("Rock") && computer.equals("Scissors"))
                || (user.equals("Paper") && computer.equals("Rock"))
                || (user.equals("Scissors") && computer.equals("Paper"))) {

            return "Player";
        }

        return "Computer";
    }

    static String[][] calculateStats(int playerWins,
                                     int computerWins,
                                     int games) {

        double playerPercentage =
                (playerWins * 100.0) / games;

        double computerPercentage =
                (computerWins * 100.0) / games;

        String[][] result = new String[2][3];

        result[0][0] = "Player";
        result[0][1] = String.valueOf(playerWins);
        result[0][2] = String.valueOf(playerPercentage);

        result[1][0] = "Computer";
        result[1][1] = String.valueOf(computerWins);
        result[1][2] = String.valueOf(computerPercentage);

        return result;
    }

    static void displayStats(String[][] stats) {

        System.out.println("\nPlayer\tWins\tPercentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                    stats[i][0] + "\t"
                            + stats[i][1] + "\t"
                            + stats[i][2] + "%"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= games; i++) {

            System.out.println("\nGame " + i);
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            String player;

            if (choice == 1)
                player = "Rock";
            else if (choice == 2)
                player = "Paper";
            else
                player = "Scissors";

            String computer = computerChoice();

            String winner = findWinner(player, computer);

            System.out.println("Player: " + player);
            System.out.println("Computer: " + computer);
            System.out.println("Winner: " + winner);

            if (winner.equals("Player"))
                playerWins++;
            else if (winner.equals("Computer"))
                computerWins++;
        }

        String[][] stats =
                calculateStats(playerWins, computerWins, games);

        displayStats(stats);
    }

}
