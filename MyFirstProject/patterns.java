package MyFirstProject;
import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        print(5);
    }



static void print(int n) {
    for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
}
}

