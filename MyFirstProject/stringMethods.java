package MyFirstProject;

public class stringMethods {
    public static void main(String[] args) {
        String name = "Aman Kumar Goswami";

        // int length = name.length();
        // char letter = name.charAt(6);
        // int index = name.indexOf('r');
        // int lastaIndex = name.lastIndexOf('a');

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.replace("a","o");
        // name = name.trim();

        System.out.println(name);

        System.out.println(name.isEmpty());
        if (name.contains(" ")){
            System.out.println("Your name contains space.");
        }else{
            System.out.println("Your name DOES NOT contains space.");
        }
        if(name.equals("Aman Kumar Goswami")){
            System.out.println("Hello " + name);
        }else{
            System.out.println("This is not your name.");
        }
        if(name.equalsIgnoreCase("aman kumar goswami")){
            System.out.println(name);
        }else{
            System.out.println("Wrong Name");
        }




        
       


    }
}
