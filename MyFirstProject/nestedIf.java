package MyFirstProject;

public class nestedIf {
    public static void main(String[] args) {
        

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You will get a discount of 20%");
                System.out.println("You will get a discount of 10%");
                price *= 0.7;
            }else{
                System.out.println("You will get a discount of 10%");
            price*= 0.9;
            
            }
            
        }else{
            if(isSenior){
                System.out.println("You will get a discount of 20%.");
                price *= 0.8;
            }else{
                System.out.println("You won't get any discounts.");

            }
        }
        System.out.printf("You have to pay %.2f$.",price);
    }
}
