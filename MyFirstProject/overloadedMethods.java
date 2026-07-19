package MyFirstProject;

public class overloadedMethods {
    public static void main(String[] args) {
        //Overloaded Methods = Methods with same name with different parameters
        //Signature = Name + parameters
        //Name will be same but siganture different

        System.out.println(bakePizza("flat bread"));
        System.out.println(bakePizza("flat bread", "mozzarella"));
        System.out.println(bakePizza("flat bread", "mozzarella", "Domino'z"));

    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " " + " pizza";
    }
    static String bakePizza(String bread, String cheese, String company){
        return company+ " " + cheese + " " + bread + " " + " pizza";
    }
}
