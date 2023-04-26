#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[9];
    scanf("%s", &s);
    
    char *ptr = s;
    while(*ptr++ != '\0'){
        
        if((*ptr - '0')%2==1){
            printf("NO");
            return;
        }
        
    }
    
    printf("YES");
    return 0;

}