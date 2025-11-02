import java.util.*;

public class C_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int TestCase = sc.nextInt();
        
        while(TestCase > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            
            if(a==b && b==c && c==d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            TestCase--;
        }
        sc.close();
    }
}