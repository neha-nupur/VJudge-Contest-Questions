import java.util.*;

public class K_Coin_Piles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (b > a) {
                long temp = a;
                a = b;
                b = temp;
            }

            
            if (a > 2 * b || (a + b) % 3 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
