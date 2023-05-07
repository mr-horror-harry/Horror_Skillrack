#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s1[1001], s2[1001];
    scanf("%s\n%s", s1, s2);
    
    char *p1=s1, *p2=s2;
    
    short ct=0;
    while(*p1!='\0'){
        
        if((*p1) != (*p2)) ct++;
        
        p1++;
        p2++;
    }
    printf("%hi", ct);
}