// ^ WEIGHT CONVERSION PROGRAM

import java.util.*;

public class Weight_Conversion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Declare variables
        double weight;
        double newWeight;
        int choice;

        // Welcome message
        System.out.println("** Weight Conversion Program **");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // prompt for user choice
        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        // option 1 convert lbs to kgs
        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The weight in kgs is : %.2f" , newWeight);
        }

        // option 2 convert kgs to lbs
        else if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The weight in lbs is : %.2f" , newWeight);
        }


        // else print not a valid choice
        else
            System.out.println("**Invalid Choice**   Please choose correct Choice.");


        sc.close();
    }
}
