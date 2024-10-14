import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] sub = new boolean[31];

        for(int i = 0; i < 28; i++) {
            int stuNum = sc.nextInt();
            sub[stuNum] = true;
        }

        for(int i = 1; i < sub.length; i++) {
            if(!sub[i]) {
                System.out.println(i);
            }
        }
    }
}