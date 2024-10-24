import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        calculate(a, b);
    }

    public static void calculate(int a, int b) {
        System.out.print((a + b) * (a - b));
    }
}