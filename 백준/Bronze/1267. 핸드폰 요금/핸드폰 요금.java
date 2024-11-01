import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 영식 요금제 - 30초 -> 10원
        // 민식 요금제 - 60초 -> 15원
        // 저번 달 통화 개수 N개 -> 20보다 작거나 같은 자연수
        int n = scanner.nextInt();
        int y = 0;
        int m = 0;

        int sum = 0;
        for(int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            y += ((time / 30) + 1) * 10;
            m += ((time / 60) + 1) * 15;
        }

        if(y < m) {
            System.out.print("Y " + y);
        } else if(y > m) {
            System.out.print("M " + m);
        } else {
            System.out.print("Y M " + y);
        }
    }
}