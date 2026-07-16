package MyFirstProject;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the operator: (+, -, *, /, ^): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {if(num2 == 0){
                System.out.println("It is undefined as the denominator is zero.");
                validOperator = false;
            }else{
                result = num1 / num2;
            }}
            case '^' -> result = Math.pow(num1, num2);

            default -> 
                {System.out.println("Invalid Operator!!");
                validOperator = false;
            }
        }
        if(validOperator){
            System.out.println("RESULT: " + result);
        }
        


        sc.close();

        
    }
}
