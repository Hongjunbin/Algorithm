import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int lastDigit = a % 10;

            List<Integer> cycle = new ArrayList<>();
            int current = lastDigit;

            while (!cycle.contains(current)) {
                cycle.add(current);
                current = (current * lastDigit) % 10;
            }

            int index = (b % cycle.size() == 0) ? cycle.size() - 1 : (b % cycle.size()) - 1;
            int computerNumber = cycle.get(index);

            if (computerNumber == 0) {
                computerNumber = 10;
            }

            result.append(computerNumber).append("\n");
        }

        System.out.print(result);
    }
}