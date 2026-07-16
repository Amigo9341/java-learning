package MyFirstProject;

public class  ternaryOperators{
    public static void main(String[] args) {
        int age = 21;

        String voteOrNot = (age >= 18) ? "You can Vote." : "You cannot vote.";
        System.out.println(voteOrNot);
    }
}