#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[101];
    scanf("%s", s);
    int x,y,i;
    scanf("%d %d", &x, &y);
    
    for(i=0; i<x; i++)
        printf("%c", s[i]);
    printf("\n");    
        
    for(i=x; i<y; i++)
        printf("%c", s[i]);
    printf("\n");
    
    for(i=strlen(s)-y; i<strlen(s); i++)
        printf("%c", s[i]);
    printf("\n");
}