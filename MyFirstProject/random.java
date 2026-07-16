package MyFirstProject;

import java.util.Random;



public class random {
    public static void main(String[] args) {
        
        Random ran = new Random();

        int number1;
        int number2;
        int number3;
        double number;
        boolean isHeads;

        number1 = ran.nextInt(1,7);
        number2 = ran.nextInt(40,101);
        number3 = ran.nextInt();
        number = ran.nextDouble();
        isHeads = ran.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number);

        if(isHeads){
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }
       

    }
}
