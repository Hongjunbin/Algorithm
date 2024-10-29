import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = 0;
        for(int i = 1; i <= size; i++) {
            num += i;
        }
        System.out.println(num);
    }
}