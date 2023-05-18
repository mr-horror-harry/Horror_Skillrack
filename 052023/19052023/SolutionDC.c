#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[10];
    scanf("%s", &s);
    
    for(short i=0; i<strlen(s); i++)
        (s[i]-'0')%2==0 ? s[i]++ : s[i]--;
    
    printf("%d ", atoi(s));

}