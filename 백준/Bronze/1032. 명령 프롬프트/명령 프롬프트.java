import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<String> builders = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            builders.add(scanner.next());
        }

        char replace = '?';
        StringBuilder pattern = new StringBuilder();

        for(int i = 0; i < builders.get(0).length(); i++) {
            char firstChar = builders.get(0).charAt(i);
            boolean isSame = true;

            for(String builder : builders) {
                if (builder.charAt(i) != firstChar) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                pattern.append(firstChar);
            } else {
                pattern.append(replace);
            }
        }

        System.out.println(pattern);
    }
}
