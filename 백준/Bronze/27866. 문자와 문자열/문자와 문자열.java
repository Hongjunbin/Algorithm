import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = scanner.nextInt();

        System.out.println(s.charAt(len - 1));

    }
}