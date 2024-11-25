import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if((n - 1) == (i - 1)) {
                result += scanner.nextInt();
                break;
            }
            result += scanner.nextInt() - 1;
        }
        System.out.println(result);
    }
}