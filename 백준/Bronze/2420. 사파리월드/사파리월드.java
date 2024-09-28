import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long result = n - m;
        if(result < 0) {
            result = result * -1;
        }
        System.out.println(result);
    }
}