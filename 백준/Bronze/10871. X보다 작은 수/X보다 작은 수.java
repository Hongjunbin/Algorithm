import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        if(1 <= n && n <= 10000 && 1 <= x && x <= 10000) {
            int[] a = new int[n];

            for(int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            for (int j : a) {
                if (x > j) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}