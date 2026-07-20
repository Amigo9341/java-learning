package MyFirstProject;

import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {1, 3, 6, 8, 7, 4, 5, 9};
        String[] fruits = {"apple", "orange", "banana"};
        // int target = 4;
        // boolean isFound = false;

        // for(int i=0; i<numbers.length; i++){
        //     if(target == numbers[i]){
        //         System.out.println("Target found at index: " + i);
        //         isFound = true;
        //         break;
        //     }
        // }
        System.out.print("Enter the target: ");
        String target = sc.nextLine();
        boolean isFound = false;

        for(int i=0; i<fruits.length; i++){
            //if(target == fruits[i]){       //It will compare the address as String is a reference data type.
            if(fruits[i].equals(target))
                System.out.println("Target found at index: " + i);
                isFound = true;
                break;
            }
        
    
        if(!isFound){
            System.out.println("Target isn't in the list.");
        }
        sc.close();
    }

    
}
