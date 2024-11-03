import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        boolean[] cup = new boolean[3];
        cup[0] = true;

        for(int i = 0; i < m; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            if(cup[x]) {
                cup[y] = cup[x];
                cup[x] = false;
            } else if(cup[y]) {
                cup[x] = cup[y];
                cup[y] = false;
            }
        }
        for(int i = 0; i < cup.length; i++) {
            if(cup[i]) {
                System.out.println(i + 1);
            }
        }
    }
}