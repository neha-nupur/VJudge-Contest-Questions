import java.util.*;

public class A_Exams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int TestCase = sc.nextInt();
        
        while(TestCase > 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            
            int TotStudent = X * Y;
            
            if(Z > TotStudent / 2) {  
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            TestCase--; 
        }
        sc.close();
    }
}


