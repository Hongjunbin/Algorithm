import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        System.out.println(calculate(a, b));
    }

    public static long calculate(long a, long b) {
        return (a + b) * (a - b);
    }
}