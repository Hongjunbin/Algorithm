import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n개의 정수가 주어진다. 1~100000
        // 이 정수들의 합 S의 부호를 구하는 프로그램.
        // 1 + 2 + 3 = 6 S의 부호
        // S가 0이면 0 -> S > 0 -> + S < 0 -> -
        for(int i = 0; i < 3; i++) {
            int size = scanner.nextInt();
            BigInteger sum = BigInteger.ZERO;
            
            for(int j = 0; j < size; j++) {
                sum = sum.add(scanner.nextBigInteger());
            }
            
            if(sum.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else if (sum.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("-");
            } else {
                System.out.println("0");
            }
        }
    }
}