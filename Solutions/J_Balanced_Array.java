import java.util.*;

public class J_Balanced_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t-- > 0){  
            int n = sc.nextInt();

            if(n % 4 != 0){
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            for(int i = 1; i <= n / 2; i++){
                System.out.print((i * 2) + " ");
            }

            for(int i = 1; i < n / 2; i++){
                System.out.print((i * 2 - 1) + " ");
            }

            // Last number to balance sum
            System.out.println(n + n/2 - 1);
        }

        sc.close();
    }
}
