import java.util.*;

public class M_Counting_Problem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){

            int sum = 0;
            int countOdd = 0;
            int N = sc.nextInt();

            int[] arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();

                sum = sum + arr[i];

                if(arr[i]%2==1){
                    countOdd++;
                }

            }  
            if(sum%2==0 && countOdd>=2){
                System.out.println("YES");
            }  else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
