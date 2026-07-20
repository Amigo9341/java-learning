package MyFirstProject;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "banana", "kiwi"};
        // System.out.println(fruits);  //will give the address as it's Reference Data Type
        // System.out.println(fruits[0]); 
        // fruits[0] = "Watermelon";
        // int numOfFruits = fruits.length;
        // System.out.println(numOfFruits); 
        // System.out.println(fruits[0]); 
        
        // for(int i=0 ; i<fruits.length ; i++){
        //     System.out.println(fruits[1]);
        //     System.out.println(fruits[i]);
        // }
        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");  //will fill the arrays with pineapple

        for(String Aman: fruits){
            System.out.println(Aman);
        }
        
    }
}
