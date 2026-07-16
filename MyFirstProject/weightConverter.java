package MyFirstProject;
import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program:-");
        System.out.println("1: Convert from kgs to lbs:-");
        System.out.println("2: Convert from lbs to kgs:-");

        System.out.print("Enter your choice:");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter weight in kgs:");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Weight in your desired form of lbs is: %.2flbs.", newWeight);
        }else if(choice == 2){
            System.out.println("Enter weight in lbs:");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Weight in your desired form of kgs is: %.2fkg.", newWeight);
        }else{
            System.out.println("That was not a valid choice.");
        }
        

        sc.close();
    }
}
