import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x <= 1000 && x >= -1000 && x != 0 && y <= 1000 && y >= -1000 && y != 0) {
            if(x > 0 && y > 0) {
                System.out.println("1");
            } else if(x > 0) {
                System.out.println("4");
            } else if(y > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}