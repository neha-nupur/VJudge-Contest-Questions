import java.util.*;

public class I_Z_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] a = new long[n];  

        for (int i = 0; i < n; i++) {
             a[i] = sc.nextLong();
        }
        

        Arrays.sort(a); 

        for (int i = 1; i + 1 < n; i += 2) {
            long tmp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = tmp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(' ');
            sb.append(a[i]);
        }
        System.out.println(sb.toString());

        sc.close();
    }
}
