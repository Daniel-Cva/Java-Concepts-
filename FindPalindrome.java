import java.util.Scanner;
public class FindPalindrome {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Text to Check it is Palindrome");
        String InputText =scanner.nextLine();
        String reversed = new StringBuilder(InputText).reverse().toString();
        if(InputText.equals(reversed)){
            System.out.println("Your Text: " + InputText + " is Palindrome 💙");
        }else{
            System.out.println("Your Text: " + InputText + " is Not Palindrome...");
        }
    }
}
