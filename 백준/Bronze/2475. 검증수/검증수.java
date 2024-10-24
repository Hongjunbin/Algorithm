import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            sum += num * num;
        }
        System.out.println(sum % 10);
    }
}