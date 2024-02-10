import java.util.Scanner;
public class Main {
    public static void main(String []args){
        // Input from user by Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Values for Variables A & B ");
        System.out.println("Enter the Value of A: ");
        int var1 = scanner.nextInt();
        System.out.println("Enter the Values of B: ");
        int var2 = scanner.nextInt();
        //Arithmetic Operations
        System.out.println("Addition of two Numbers: " + (var1 + var2) );
        System.out.println("Subtraction of Two Numbers: " + (var1 - var2) );
        System.out.println("Multiplication of Two Numbers: " + (var1 * var2) );
        System.out.println("Division of Two Numbers(Quotient): " + (var1 / var2) );
        System.out.println("Division of Two Numbers(Remainder) " + (var1 % var2) );
    }
}
