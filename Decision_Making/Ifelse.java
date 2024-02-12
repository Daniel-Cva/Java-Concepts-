package Decision_Making;

import java.util.Scanner;
public class Ifelse {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age =scanner.nextInt();
        System.out.println("Are you Registered for vote?");
        System.out.println("Enter True or False ");
        boolean Voteregister =scanner.nextBoolean();
        if(age >= 18 && Voteregister) {
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}
