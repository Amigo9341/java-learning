package MyFirstProject;

import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        String name = "";
        // while(name.isEmpty()){
        //     System.out.print("Enter your name: ");
        //     name = sc.nextLine();
        // }
        // System.out.println("Hello " + name);
        do{
            System.out.println("Enter a number between 1 to 10");
            number = sc.nextInt();
        }while(number < 1 || number > 10);
        System.out.println("You chose " + number);


        sc.close();
    }
}
