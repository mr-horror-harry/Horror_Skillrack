#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[1001];
    char c;
    
    scanf("%s\n%c", s, &c);
    
    for(short i=0; i<strlen(s); i++)
        if(s[i]!=c)
            printf("%c", s[i]);

}