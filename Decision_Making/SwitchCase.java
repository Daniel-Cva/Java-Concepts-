import java.util.Scanner;
public class SwitchCase{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find Your Season 🗺🌏");
        System.out.println("Enter Month (in-small-words-only)");
        String month = scanner.nextLine();
        String Ans = "";
        switch ( month ){
            case "december":
            case "january":
            case "february":
                Ans = "Winter ❄⛄";
                break;
            case "march":
            case "april":
            case "may":
                Ans = "Spring 🌼🌺";
                break;
            case "june":
            case "july":
            case "august":
                Ans = "Summer ☀🌞";
                break;
            case "september":
            case "october":
            case "november":
                Ans = "Autumn 🍁🍂";
                break;
            default:
                 Ans ="""
                        Oops!!!
                        Invalid-Month 
                        Retry
                        Have a good Day!
                        """;
        }
        System.out.println(month + ": " + Ans );
    }
}