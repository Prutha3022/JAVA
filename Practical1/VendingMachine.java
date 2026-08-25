package Practical1;

import java.util.Scanner;

public class VendingMachine {
    enum Coin{
        ONE, TWO, FIVE, TEN
    }
    public static void main(String[] args) {
        final int price = 15;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Snack Price = " + price);
        while(total<price){
           
            System.out.print("Enter a coin (ONE, TWO, FIVE, TEN)");
            String input = sc.next().toUpperCase();
            Coin coin = Coin.valueOf(input);
            total += switch (coin) {
                case ONE -> 1;
                case TWO -> 2;
                case FIVE -> 5;
                case TEN -> 10;
                };

            System.out.println("Total = " + total);
        }

        int change = total - price;
        System.out.println("Snack dispensed!");
        System.out.println("Change = " + change);
    }  
}

