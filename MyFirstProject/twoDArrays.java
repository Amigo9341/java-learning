package MyFirstProject;

public class twoDArrays {
    public static void main(String[] args) {
        String[] flowers = {"rose", "lotus", "sunflower"};
        String[] fruits = {"apple", "banana", "kiwi"};
        String [] sports = {"football", "cricket", "basketball"};

        //String [][] world= {flowers, fruits, sports};
        String[][] world = {{"rose", "lotus", "sunflower"},
                            {"apple", "banana", "kiwi"},
                            {"football", "cricket", "basketball"}};

        world[2][2] = "f1";
        world[1][1] = "guava";
        world[0][1] = "daisy";

        for(String[] Aman : world){
            for(String Satyam : Aman){
                System.out.print(Satyam + "  ");
            }
            System.out.println(Aman);
        }
    }
}
