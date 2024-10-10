import java.util.Scanner;
public class DecisionMaking{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Find Your Season 🌏🗺");
        System.out.println("Enter Your Month(In Numbers)");
        int month =scanner.nextInt();
        String Season;
        if( month == 12 || month == 1 || month == 2){
            Season = "Winter ❄☃";
        } else if( month == 3 || month == 4 || month == 5 ){
            Season = "Spring 🍃";
        } else if( month == 6 || month == 7 || month == 8) {
            Season = "Summer 🌞";
        } else if( month == 9 || month == 10 || month == 11 ){
            Season = "Autumn 🍂🍁";
        } else {
            Season = "Fake Month";
        }
        System.out.println("This is the " +Season+ " season");
    }
}