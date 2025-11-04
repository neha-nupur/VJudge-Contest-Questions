import java.util.*;

public class E_AddOrXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            if (b < a) {
                if (b == a - 1 && (a & 1) == 1) {
                    // a is odd, a XOR 1 = a - 1
                    System.out.println(y);
                } else {
                    System.out.println(-1);
                }
            } else if (a == b) {
                System.out.println(0);
            } else {
                long diff = b - a;
                
                long evenToOdd = 0;

                long oddToEven = 0;
                
                
                if (diff % 2 == 0) {
                    evenToOdd = oddToEven = diff / 2;
                } else {
                    if ((a & 1) == 1) {
                        oddToEven = (diff + 1) / 2;
                        evenToOdd = diff / 2;
                    } else {
                        evenToOdd = (diff + 1) / 2;
                        oddToEven = diff / 2;
                    }
                }
                long cost = evenToOdd * Math.min(x, y) + oddToEven * x;
                System.out.println(cost);
            }
            t--;
        }

        sc.close();
    }
}