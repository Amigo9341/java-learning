package MyFirstProject;
import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) throws InterruptedException {
        // int i;
        // for(i = 1; i < 10; i++){
        //     System.out.println("pizza");
        // }
        Scanner sc = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?: ");
        int start = sc.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!!");
        sc.close();
    }
}
//break = break out of a loop (STOP)
//continue = skip current iteration of a loop (SKIP)