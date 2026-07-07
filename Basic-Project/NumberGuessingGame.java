// ^ NUMBER GUESSING GAME PROGRAM

import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max);

        System.out.println("--Number Guessing Game--");
        System.out.println("Guess a number between " + min + " - " + max);

        do {
            System.err.print("Enter a guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("TOO LOW! Try again" );
            }else if (guess > randomNumber) {
                System.out.println("TOO High! Try again" );
            }else {
                System.out.println("\nCORRECT! The number was " + randomNumber);
                System.out.println("Number of Attempts: " + attempts);
            }

        } while (guess != randomNumber);

        System.out.println("You Have Won!");
        sc.close();
    }
}