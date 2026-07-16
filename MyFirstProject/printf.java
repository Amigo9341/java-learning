package MyFirstProject;

public class printf {
    public static void main(String[] args) {

        String name = "Spongebob Squarepants";
        char symbol = 'S';
        int age = 30;
        boolean isEmployed = true;
        double height = 60.5;


        //SPECIFIER CHARACTER
        System.out.printf("Hello! %s\n", name);
        System.out.printf("%s is %f cms tall\n", name, height);
        System.out.printf("The age of %s is %d\n", name, age);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("The %c of %s name is\n", symbol, name);

        // double price1 = 9000.99;
        // double price2 = 2600000.362;
        // double price3 = 660000.234;

        double price1 = 9.99;
        double price2 = 26.362;
        double price3 = -66.234;  //For bracket() and space

        //PRECISION PART
        //UPTO .'n' decimal places
        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.3f\n", price3);

        //',' on every three digits from units place
        System.out.printf("%,2f\n", price1);
        System.out.printf("%,2f\n", price2);
        System.out.printf("%,2f\n", price3);

        //'(' to show the -ve numbers on brackets
        System.out.printf("%(.1f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.3f\n", price3);

        //' ' space to show +ve or -ve on numbers. Normal for -ve but a space then no. for +ve
        System.out.printf("% .1f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .3f\n", price3);

       int id1 = 1;
       int id2 = 26;
       int id3 = 456;
       int id4 = 1258;

       //WIDTH
       // 0 = ZERO PADDING
       // number = right justified padding
       // negative number = left justified padding

       System.out.printf("%d\n", id1);
       System.out.printf("%d\n", id2);
       System.out.printf("%d\n", id3);
       System.out.printf("%d\n", id4);

       System.out.printf("%04d\n", id1);
       System.out.printf("%04d\n", id2);
       System.out.printf("%04d\n", id3);
       System.out.printf("%04d\n", id4);

       System.out.printf("%4d\n", id1);
       System.out.printf("%4d\n", id2);
       System.out.printf("%4d\n", id3);
       System.out.printf("%4d\n", id4);

       System.out.printf("%-4d\n", id1);
       System.out.printf("%-4d\n", id2);
       System.out.printf("%-4d\n", id3);
       System.out.printf("%-4d\n", id4);
    }
}
