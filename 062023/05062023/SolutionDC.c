#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[16];
    scanf("%s ", s);
    
    short i=0;
    for(i=0; i<strlen(s)-1; i+=2)
        printf("%d ", (s[i]-'0')*(s[i+1]-'0'));
    
    if(strlen(s)%2==1) printf("%c ", s[strlen(s)-1]);

}