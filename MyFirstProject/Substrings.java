package MyFirstProject;

public class Substrings {
    public static void main(String[] args) {
        
        //.substring = method to extract a portion of the string
        // .substring(start, end);

        String email = "akg2026@gmail.com";
        String username = email.substring(0,3);
        String code = email.substring(7,13);
        // String domain = email.substring(3,7);
        String domain = email.substring(8);
        String notDomain = email.substring(7,email.indexOf('.') + 1); //see result to know
        // String noUsername = email.substring(3);
        String noUsername = email.substring(email.indexOf('2'));

        System.out.println(username);
        System.out.println(code);
        System.out.println(domain);
        System.out.println(notDomain);
        System.out.println(noUsername);

    }
}
