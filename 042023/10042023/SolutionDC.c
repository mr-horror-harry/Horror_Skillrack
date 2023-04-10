#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[101];
    scanf("%s ",&s);
    
    for(int i=0; i<strlen(s)-2; i++){
        if(s[i]==s[i+1] && s[i+1]==s[i+2]){
            printf("invalid");
            return 1;
        }
    }
    printf("valid");
    return 1;
}