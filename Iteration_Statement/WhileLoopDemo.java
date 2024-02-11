package Iteration_Statement;
import java.util.Scanner;
public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        System.out.println("n is a whole number and less than or equal to 100");
        int n = scanner.nextInt();
        if (n <= 100) {
            System.out.println(" Condition is True! ");
            //Entry check loop
            while (n <= 100) {
                System.out.print(" N: ");
                System.out.println(n);
                n++; // or n = n+1;
            }
        }else{
            System.out.println(" Condition is False... \n Retry");
        }
    }
}