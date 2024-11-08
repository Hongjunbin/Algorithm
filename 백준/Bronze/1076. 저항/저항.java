import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> colors = new HashMap<>();
        colors.put("black", 0);
        colors.put("brown", 1);
        colors.put("red", 2);
        colors.put("orange", 3);
        colors.put("yellow", 4);
        colors.put("green", 5);
        colors.put("blue", 6);
        colors.put("violet", 7);
        colors.put("grey", 8);
        colors.put("white", 9);

        String colorNumber = "";

        for(int i = 0; i < 2; i++) {
            colorNumber += String.valueOf(colors.get(scanner.nextLine()));
        }
        long result = Long.parseLong(colorNumber) * (long)Math.pow(10, colors.get(scanner.nextLine()));

        System.out.println(result);

    }
}