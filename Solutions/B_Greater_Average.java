import java.util.*;

public class B_Greater_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int TestCase = sc.nextInt();
        
        while(TestCase > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            double Average = (A + B)/2.0;
            
            if(Average > C) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            TestCase--;
        }
        sc.close();
    }
} 
    

