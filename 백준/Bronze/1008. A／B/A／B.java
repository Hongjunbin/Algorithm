import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber = sc.nextDouble();
        double secondNumber = sc.nextDouble();
        if(firstNumber > 0 && secondNumber < 10) {
            System.out.println(firstNumber / secondNumber);
        }
    }
}