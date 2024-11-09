import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().trim();
        if(text.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = text.split(" ");
            System.out.println(words.length);
        }
    }
}