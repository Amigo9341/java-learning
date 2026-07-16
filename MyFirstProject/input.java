
package MyFirstProject;

import java.util.Scanner;



public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // String firstName = sc.next();
        String fullName = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("What is your SGPA? ");
        double sgpa = sc.nextDouble();

        System.out.print("You are a student? True/False ");
        boolean student = sc.nextBoolean();

        System.out.println("My name is " + fullName);
        System.out.println("I am " + age + " years old.");
        System.out.println("I am maintaining an SGPA of " + sgpa);
        System.out.println("Student: " + student);

        if(student){
            System.out.println("You are enrolled as a student.");
        }else{
            System.out.println
            ("You are NOT enrolled.");
        }

        Scanner sc1 = new Scanner(System.in);

        double height = 0;
        double width = 0;
        double area = 0;
        
        System.out.print("Enter the height: ");
        height = sc1.nextDouble();

        System.out.print("Enter the width: ");
        width = sc1.nextDouble();

        area = height * width;
        System.out.print("The Area is: " + area + " cm²");

        sc.close();



    }
    
}
