package MyFirstProject;

public class main{
    /*
    Multi
    line 
    comment */
    public static void main(String[] args) {
        System.out.println("I like Pizza!");
        System.out.print("Its really good.\n"); //println is for printing line. Same can be done with- '\n'.
        System.out.println(("Buy me One!")); 
        
        int age = 21;
        int year = 2026;
        System.out.println("My age is " + age);

        double interest = 4.12;
        double gpa = 4.9;
        System.out.println(interest);

        boolean forSale = true;
        boolean notAvailable = false;

        

        String name = "Aman Kumar Goswami";
        String car = "Ferrari";
        String GP = "Monaco Grand Prix";
        String driver = "Charles Leclerc";
        System.out.println(name);

        System.out.println("In the year " + year + " the winner of the " + GP + " was not " + driver + " in his " + car);
        if(forSale){
            System.out.println("A " + car + " was in sale in the year " + year);
        } else{
            System.out.println("The " + car + " was never for sale.");
        }
        if(notAvailable){
            System.out.println("The car " + car + year + " was on big demand.");
        }
        else{
            System.out.println("The car " + car + year + " was not available to drive for " + driver+" " + GP+" " + year);
        }
    }
}

// 🟥 Primitive = simple value stored directly in memory (stack)
// 🟦 Reference = memory address (stack) that points to the (heap)

// 🟥 Primitive vs 🟦 Reference
// ----------------------------
//    int               string
//    double            array
//    char              object
//    boolean

// double contains decimal. boolean is for True or False.
//Char contains a single character with ''. String contains sequence of characters with "".
/*char ch = 'H';   // ✅      int a ='54';       ✅
char ch = 'Hi';  // ❌ Error  int b = '25.0012'; ❌ 
String s1 = "H";      // ✅   double c = '412.235'; ✅  
String s2 = "Hi";     // ✅   double d = '5';       ✅ can be referred as 5.00
String s3 = "";       // ✅ Empty string */


