import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if(Objects.equals(text, "#")) {
                break;
            }
            int sum = 0;
            for(int i = 0; i < text.length(); i++) {
                switch (text.charAt(i)) {
                    case 'a': sum++; break;
                    case 'i': sum++; break;
                    case 'u': sum++; break;
                    case 'e': sum++; break;
                    case 'o': sum++; break;
                    case 'A': sum++; break;
                    case 'I': sum++; break;
                    case 'U': sum++; break;
                    case 'E': sum++; break;
                    case 'O': sum++; break;
                    default: break;
                }
            }
            System.out.println(sum);
        }
    }
}