import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 정수 n과 f가 주어짐.
        // n을 f로 나누어 떨어지게 만들어야함.
        // 조건은 n의 가장 뒤 두자리를 변경하여 나누어 떨어지게 하면 된다.
        // 나누어 떨어진다 => 몫이 0이어야 한다.
        // n은 100보다 커야한다.
        int n = scanner.nextInt();
        int f = scanner.nextInt();

        int len = Integer.toString(n).length();
        String result = "";
        String text = "";
        for(int i = 0; i < 100; i++) {
            text = Integer.toString(n).substring(0, len - 2);
            if(i < 10) {
                result = "0" + i;
            } else {
                result = String.valueOf(i);
            }
            text += result;

            if(Long.parseLong(text) % f == 0) {
                break;
            }
        }
        System.out.println(result);
    }
}