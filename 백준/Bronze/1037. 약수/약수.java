import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> divisors = new ArrayList<>();

        for(int i = 0; i < count; i++) {
            divisors.add(scanner.nextInt());
        }

        int result = Collections.max(divisors) * Collections.min(divisors);
        System.out.println(result);
    }
}