import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        BigInteger m = new BigInteger(sc.next());
        
        BigInteger quotient = n.divide(m);
        BigInteger remainder = n.mod(m);
        
        System.out.println(quotient);
        System.out.println(remainder);
    }
}
