// ^ DICE ROLLER PROGRAM

import java.util.*;

public class Dice_Roller {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // declare variables
        int numOfDice;
        int total = 0;

        // get number of dice from the user
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = sc.nextInt();

        // check if # of dice > 0
        if (numOfDice > 0) {

            // roll all the dice
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDice(roll);
                System.out.println(i + 1 + " Dice Rolled value: " + roll);

                total += roll;
            }
            System.out.println("\nTotal value: " + total);

        } else {
            System.err.println("Number of dice must be greater than 0.");
        }

        sc.close();
    }

    // display ASCII of dice
    static void printDice(int roll) {

        String dice1 = """
                     -------
                    |       |
                    |   ●   |
                    |       |
                     -------
                """;
        String dice2 = """
                     -------
                    | ●     |
                    |       |
                    |     ● |
                     -------
                """;
        String dice3 = """
                     -------
                    | ●     |
                    |   ●   |
                    |     ● |
                     -------
                """;
        String dice4 = """
                     -------
                    | ●   ● |
                    |       |
                    | ●   ● |
                     -------
                """;
        String dice5 = """
                     -------
                    | ●   ● |
                    |   ●   |
                    | ●   ● |
                     -------
                """;
        String dice6 = """
                     -------
                    | ●   ● |
                    | ●   ● |
                    | ●   ● |
                     -------
                """;

        switch (roll) {
            case 1: System.out.print(dice1);
                break;
            case 2: System.out.print(dice2);
                break;
            case 3: System.out.print(dice3);
                break;
            case 4: System.out.print(dice4);
                break;
            case 5: System.out.print(dice5);
                break;
            case 6: System.out.print(dice6);
                break;
            default: System.out.println("Invalid Dice");
                break;
        }
    }

}
