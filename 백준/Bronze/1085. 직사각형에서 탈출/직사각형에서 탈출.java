import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int left = x;
        int right = w - x;
        int bottom = y;
        int top = h - y;

        int minDistance = Math.min(Math.min(left, right), Math.min(bottom, top));

        System.out.println(minDistance);

        scanner.close();
    }
}