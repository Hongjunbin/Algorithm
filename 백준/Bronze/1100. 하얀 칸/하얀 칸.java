import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int result = 0;
        for(int i = 1; i <= 8; i++) {
            String piece = scanner.nextLine();
            if(i % 2 == 1) {
                for(int j = 1; j <= 8; j++) {
                    char chess = piece.charAt(j - 1);
                    if(j % 2 == 1 && Objects.equals(chess, 'F')) {
                        result++;
                    }
                }
            } else {
                for(int j = 1; j <= 8; j++) {
                    char chess = piece.charAt(j - 1);
                    if(j % 2 == 0 && Objects.equals(chess, 'F')) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}