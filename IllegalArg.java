import java.util.Scanner;

enum Color1{
    RED, GREEN, BLUE
}

public class IllegalArg{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a color (Red, green, blue)");
        String input = sc.next().toUpperCase();

        try{
            Color1 color = Color1.valueOf(input);
            System.out.println("You selected: " + color);

        }
        catch(IllegalArgumentException e){
            System.out.print("Invalid color entered.");
        }
    }
}