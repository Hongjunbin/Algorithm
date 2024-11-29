import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // 24 -> 1 2 3 4 6 8 12 24
        // 18 -> 1 2 3 6 9 18
        // 최대 공약수 -> 6
        int max = 0;

        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        // 24 -> 24 48 72
        // 18 -> 18 36 54 72
        // 최대 공배수 -> 72
        System.out.println(max);
        System.out.println((a * b) / max);
    }
}