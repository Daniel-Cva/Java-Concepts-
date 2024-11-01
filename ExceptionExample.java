import java.util.Scanner;
public class ExceptionExample{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter your Name: ");
            String Name = scanner.nextLine();
            System.out.println("Enter Your Age: ");
            int age = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Invalid Input, Try Again");
        }
    }
}
