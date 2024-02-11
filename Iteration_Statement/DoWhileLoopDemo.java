package Iteration_Statement;
import java.util.Scanner;
public class DoWhileLoopDemo {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("m is less than or equal to 20");
        System.out.println("Enter the value of m: ");
        int m = scanner.nextInt();
        //Exit check loop
        do{
            System.out.println(m);
            m++;
        }while(m <= 20);
    }
}
