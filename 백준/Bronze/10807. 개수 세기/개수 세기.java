import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[sc.nextInt()];
        for(int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int result = 0;
        for(int i = 0; i < n.length; i++) {
            if(n[i] == v) {
                result++;
            }
        }
        System.out.println(result);
    }
}