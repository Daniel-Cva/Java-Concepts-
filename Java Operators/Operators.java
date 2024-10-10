import java.util.Scanner;
public class Operators{
    public static void main(String []args){
        Scanner scanner =new Scanner(System.in); //Initializing Scanner Class
        System.out.println("Enter Two Numbers: ");
        System.out.print("Enter First Number: ");
        int a =scanner.nextInt(); //Input from user
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt(); //Input from user
        System.out.println("First number A: " + a); //Display A
        System.out.println("Second number B: " + b); //Display B
        if(a>b)
            System.out.println("A is Biggest");
        else
            System.out.println("B is Biggest");
        System.out.println("Addition: " + (a + b)); //add operation
        System.out.println("Subtraction: " + (a - b)); //subtract operator
        System.out.println("Multiplication: " + (a * b)); //multiply operator
        System.out.println("Division: " + (a / b)); //Division operator
        System.out.println("Mudulent: " + (a % b)); //mod operator
    }
}