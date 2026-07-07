// ^  SHOPPING CART PROGRAM

import java.util.*;

public class Shopping_Cart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        String currency = "Rs ";
        double total;

        System.out.print("Enter What item could you like to buy?: ");
        item = sc.nextLine();

        System.out.print("Enter the price for each item?: ");
        price = sc.nextDouble();

        System.out.print("Enter number of quantity would you like to buy?: ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "'s");
        System.out.println("Your total bill is " + currency + total);


        sc.close();
    }
}
