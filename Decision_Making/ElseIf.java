package Decision_Making;
import java.util.Scanner;
public class ElseIf {
    public static void main(String [] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the value of A: ");
       int A = scanner.nextInt();
       System.out.println("Enter the value of B: ");
       int B =scanner.nextInt();
       System.out.println("Enter the value of C: ");
       int C =scanner.nextInt();
       if (A > B && A > C) {
           System.out.println(" A is Greatest Number: " + A );
       }else if (B > A && B > C){
           System.out.println(" B is Greatest Number: " + B );
       }else if (C > A && C > B){
           System.out.println(" C is Greatest Number: " + C );
       } else{
           System.out.println("All numbers are equal");
       }
    }
}
