import java.util.Scanner;

public class Add{
    static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("The sum is: "+sum);
        input.close();
    }
}