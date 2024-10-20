import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] charArr = text.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if(Character.isUpperCase(charArr[i])) {
                charArr[i] = Character.toLowerCase(charArr[i]);
            } else {
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
        }
        for(char result : charArr) {
            System.out.print(result);
        }
    }
}