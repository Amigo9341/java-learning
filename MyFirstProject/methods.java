package MyFirstProject;

public class methods {
    public static void main(String[] args) {
    //     String name = "Aman Kumar Goswami";
    //     int age = 21;
    

    //     basicIntro(name,age);
    //     basicIntro(name,age);                   //Look carefully

    //     basicIntro("Aman",21);
    //     basicIntro("Satyam",19);
    // }

    //     static void basicIntro(String name, int age){
        
    //     System.out.printf("Hey, %s\n", name);
    //     System.out.println("How are you doing?");
    //     System.out.printf("How was your %dst birthday?\n",age);
    //     System.out.println("Do great in life.");
    System.out.println(multiply(5, 3));
    System.out.println(square(6));
    System.out.println(cube(9));
    System.out.println(fullName("Spongebob","Squarepants"));
    int age = 55;
    if(canVote(age)){
        System.out.println("You can vote!");
    }else{
        System.out.println("You cannot vote!");
    }
    }

    static double multiply(double num1, double num2 ){
        return num1 * num2;
    }
    static double square(double num){
        return num * num;
    }
    static double cube(double number){
        return Math.pow(number, 3);
    }
    static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    static boolean canVote(int a){
        return a >= 18;
        // if(age >= 18){
        //     return true;
        // }else{               //can be done either way
        //     return false;
        // }
    }
        
    
}
