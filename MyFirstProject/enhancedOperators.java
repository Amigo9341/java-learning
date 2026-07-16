package MyFirstProject;
import  java.util.Scanner;

public class enhancedOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the day:");
        String day = sc.nextLine();

        switch(day){
            case "Monday", "Tuesday","Wednesday", "Thursday", "Friday" -> 
            System.out.println("This is a weekday.😫");

            case "Saturday", "Sunday" ->
            System.out.println("This is Weekend not The Weeknd. 😁");

            default -> System.out.printf("%s is not a day.", day);

            
        }
        sc.close();
        }
    }

