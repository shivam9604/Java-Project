// ^ ROCK PAPER SCISSOR PROGRAM

import java.util.*;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // DECLARE VARIABLES
        String[] choice = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println("========== Let Plays ROCK, PAPER, SCISSOR Game! ==========" );

        // GET CHOICE FROM THE USER
        do{
            System.out.print("Player, Enter Your Move: ");
            playerChoice = sc.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") && 
                !playerChoice.equals("scissor")) {
                System.out.println("Invalid Choice!!");
                continue;
            }


            // GET RANDOM CHOICE FOR THE COMPUTER
            computerChoice = choice[random.nextInt(3)];
            System.out.println("Computer, Enter Your Move: " + computerChoice);

            // CHECK WIN CONDITION
            if (playerChoice.equals(computerChoice)) {
                System.out.println("---- YUP! GAME TIE ----");
            }else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissor") && computerChoice.equals("paper"))){
                System.out.println("---- HURRAY! YOU WIN ----"); 
            }else {
                System.out.println("---- OH KNOW! YOU LOSS ----");
            }

            // ASK TO PLAY AGAIN?
            System.out.println("Play Again(yes/no): ");
            playAgain = sc.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        // GOODBYE MESSAGE
        System.out.println("********** THANKS FOR PLAYING **********");
        sc.close();
    }
}
