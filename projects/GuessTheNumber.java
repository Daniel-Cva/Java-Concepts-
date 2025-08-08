import static java.lang.Math.*;
import java.util.Scanner;
public class GuessTheNumber {
    static int points= 0;
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        for(int i =1; i<=10; i++) {
            double GenerateRandom= (round(random() * 10));
            System.out.println("Welcome to the Guess Game");
            System.out.println("You Have Only 10 Chances");
            System.out.println("Chance: "+ i);
            System.out.print("Enter Number is less than 10: ");
            int Guess = scanner.nextInt();
            boolean CorrectGuess = ( GenerateRandom == Guess );
            if (CorrectGuess) {
                System.out.println("😍 Your Guess is Correct...");
                points++;
            }else {
                System.out.println("🙁OOPS..Your Guess is InCorrect");
                System.out.println("Correct Answer: "+GenerateRandom);
            }
            System.out.println("Your Points: "+ points);
            System.out.println("------------------------------------------------------");
        }
    }
}
