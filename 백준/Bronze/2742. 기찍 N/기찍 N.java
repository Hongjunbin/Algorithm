import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int result = size + 1;
        for(int i = 0; i < size; i++) {
            result = result - 1;
            System.out.println(result);
        }
    }
}