import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int result = firstNumber > 0 && secondNumber < 10 ? firstNumber - secondNumber : 0;
        System.out.println(result);
    }
}