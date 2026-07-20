package MyFirstProject;

import java.util.Scanner;

public class userInputArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] foods; //= new String[4];
        // foods[0] = "Chapati";
        // foods[1] = "Rice";
        // foods[2] = "Sabji";
        // foods[3] = "Dal";
        System.out.print("Enter the no. of food items: ");
        int foodItems = sc.nextInt();
        sc.nextLine(); //nextInt before nextLine ki wajah se ye extra likhna pada. See CGPT history for the reason.
        foods = new String[foodItems];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter the food: ");
            foods[i] = sc.nextLine();
        }

        for(String Aman : foods){
            System.out.println(Aman);
        }
    }
}
