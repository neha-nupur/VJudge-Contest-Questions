import java.util.*;

public class N_Guess_the_Winner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            long N = sc.nextLong();

             if (N == 1 || N % 2 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }
        sc.close();
    }
}
