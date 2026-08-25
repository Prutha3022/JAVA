import java.util.Scanner;
public class SwitchExpression{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade (1-5)");
        int grade = sc.nextInt();
        String result = switch(grade){
            case 1 -> "Excelent";
            case 2 -> "Very Good";
            case 3 -> "Good";
            case 4 -> "Average";
            case 5 -> "Poor";
            default -> "Invalid Grade";
        };
        
        System.out.println(result);
        sc.close();
    }
}
