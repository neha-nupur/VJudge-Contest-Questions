import java.util.*;

public class F_Digit_Frequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] freq = new int[10];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int digit = ch - '0';  
                freq[digit]++;  
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(freq[i] + " ");
        }

        sc.close();
    }
}
