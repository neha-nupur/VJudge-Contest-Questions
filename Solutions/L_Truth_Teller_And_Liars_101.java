import java.util.*;

public class L_Truth_Teller_And_Liars_101 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int N = sc.nextInt();
            int M = sc.nextInt();

            if(N<=M) {
                System.out.println(-1);
            } else if(2*M + 1 <= N + M){
                System.out.println(2*M+1);
            } else {
                System.out.println(N+M);
            }
        }

        sc.close();

    }
}
