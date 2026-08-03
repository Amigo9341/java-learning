package MyFirstProject;
import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        print8(5);
    }



static void print(int n) {
    for(int i = 1; i <= n; i++){
            for(int j = 0; j <= n - i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
static void print1(int n) {
    for(int i = 0; i < n; i++){
        for(int j = 0; j < i ; j++){
            System.out.print(" ");
        }

        for(int j = 0; j < 2 * n - 2 * i - 1; j++){
            System.out.print("*");
        }
        for(int j = 0; j < i; j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}
static void print2(int n) {
    for(int i = 0; i < 2 * n - 1; i++) {
        int stars = i + 1;
    if (i >= n) {
    stars = 2 * n - i - 1;
}
        for(int j = 1; j <= stars; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
static void print3(int n) {
    int start = 1;
    for(int i = 0; i < n; i++) {
        if(i % 2 == 0) start = 1;
        else start = 0;
        for(int j = 0; j <= i; j++){
            System.out.print(start);
            start = 1 - start;
        }
        System.out.println();
        
    }
}
static void print4(int n) {
    int space = 2 * (n - 1);

    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        for(int j = 1; j <= space; j++) {
            System.out.print(" ");
        }
        for(int j = i; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println();
        space -= 2;
        
    }
}
static void print5(int n) {
    int num = 1;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++) {
            System.out.print(num);
            num += 1;
    
        }
        System.out.println();
    }
}
static void print6(int n) {
    for(int i = 0; i < n; i++) {
        for(char ch = 'A'; ch <='A' + i; ch++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
static void print7(int n) {
    for(int i = 0; i < n; i++) {
        for(char j = 'A' ; j <= 'A' + (n - i - 1); j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}
static void print8(int n) {
    for(int i = 0; i < n; i++) {
        char alpha = (char) ('A' + i);
        for(int j = 0; j <= i; j++) {
            System.out.print(alpha + " ");
        }
        System.out.println();
    }
}
}

