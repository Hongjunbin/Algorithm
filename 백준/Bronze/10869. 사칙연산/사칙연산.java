import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        if(firstNumber >= 1 && secondNumber <= 10000) {

            int addResult = firstNumber + secondNumber;
            int subtractResult = firstNumber - secondNumber;
            int multiplyResult = firstNumber * secondNumber;
            int divideResult = firstNumber / secondNumber;
            int shareResult = firstNumber % secondNumber;

            System.out.println(addResult);
            System.out.println(subtractResult);
            System.out.println(multiplyResult);
            System.out.println(divideResult);
            System.out.println(shareResult);
        }
    }
}