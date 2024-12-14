import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentHour = sc.nextInt();
        int currentMinute = sc.nextInt();

        int cookingTime = sc.nextInt();

        int totalMinutes = currentHour * 60 + currentMinute + cookingTime;

        int endHour = (totalMinutes / 60) % 24;
        int endMinute = totalMinutes % 60;

        System.out.println(endHour + " " + endMinute);

        sc.close();
    }
}