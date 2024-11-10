import java.util.Scanner;

public class Main {

    private static final String STRING_ZERO = "0";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int inputCopy = input;
        int cycle = 0;

        while(true) {
            cycle++;
            String textNumber = "";
            if(inputCopy < 10) {
                textNumber = STRING_ZERO + inputCopy;
            } else {
                textNumber = String.valueOf(inputCopy);
            }
            int a = Integer.parseInt(String.valueOf(textNumber.charAt(0)));
            int b = Integer.parseInt(String.valueOf(textNumber.charAt(1)));
            int result = a + b;
            if(result >= 10) {
                result = result % 10;
            }
            inputCopy = Integer.parseInt(String.valueOf(b) + result);
            if(input == inputCopy) {
                break;
            }
        }
        System.out.println(cycle);
    }
}