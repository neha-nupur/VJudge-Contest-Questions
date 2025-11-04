#include <stdio.h>
#include <string.h>

int main() {

    char s[1001];  

    int freq[10] = {0}; 

    scanf("%s", s);

    for (int i = 0; i < strlen(s); i++) {

        char ch = s[i];

        if (ch >= '0' && ch <= '9') {  
            int digit = ch - '0';      
            freq[digit]++;   
          
        }
    }

    for (int i = 0; i < 10; i++) {
        printf("%d ", freq[i]);

    }

    return 0;
}
