package MyFirstProject;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 5);
        // result = Math.abs(-4.6);
        // result = Math.sqrt(16);
        // result = Math.round(30.91);
        // result = Math.ceil(12.01);
        // result = Math.floor(2.99);
        // result = Math.max(2, 5);
        // result = Math.min(2, 5);

        // System.out.println(result);

        // Scanner sc = new Scanner (System.in);

        // System.out.println("Enter one side: ");
        // double s1 = sc.nextDouble();

        // System.out.println("Enter other side: ");
        // double s2 = sc.nextDouble();

        // double c = Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));

        // System.out.println("The Hypotenuse of the right triangle is: " + c + "cms");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the sphere: ");
        double radius = scan.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference of the sphere is: " + circumference);
        System.out.println("The area of the sphere is: " + area + " cm²");
        System.out.println("The volume of the sphere is: " + volume + " cm³");

        scan.close();

        // sc.close();

    }
}
