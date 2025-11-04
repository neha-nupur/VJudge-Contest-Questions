import java.util.*;

public class H_Candies_For_Nephews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int rem = n % 3;

            int candToBuy = (3 - rem) % 3;

            System.out.println(candToBuy);
        }

        sc.close();
    }
}
