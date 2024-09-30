import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        do {
            a = sc.nextInt();
            b = sc.nextInt();
            if(0 < a && b < 10) {
                System.out.println(a + b);
            }
        } while (a != 0 || b != 0);
    }
}