import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int burger1 = sc.nextInt();
        int burger2 = sc.nextInt();
        int burger3 = sc.nextInt();
        int drink1 = sc.nextInt();
        int drink2 = sc.nextInt();
        
        int minBurger = Math.min(burger1, Math.min(burger2, burger3));
        int minDrink = Math.min(drink1, drink2);
        
        int setPrice = minBurger + minDrink - 50;
        
        System.out.println(setPrice);
    }
}
