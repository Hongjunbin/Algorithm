import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int inputCopy = input;
        int cycle = 0;

        do {
            cycle++;
            int a = inputCopy / 10;   // 첫 번째 자리
            int b = inputCopy % 10;   // 두 번째 자리
            int sum = (a + b) % 10;   // 두 자리 합의 마지막 자리
            inputCopy = b * 10 + sum; // 새로운 숫자 생성
        } while (input != inputCopy);

        System.out.println(cycle);
    }
}