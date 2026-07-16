package MyFirstProject;
import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type the username: ");
        String username = sc.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must contain 4-12 characters.");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username does not contain Spaces or Underscores.");
        }
        else{
            System.out.println("Hello! " + username);
        }
        sc.close();

        
    }
}
