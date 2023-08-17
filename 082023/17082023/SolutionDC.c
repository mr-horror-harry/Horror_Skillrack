#include<stdio.h>
#include<stdlib.h>

int main()
{
    int x, l=0, r=0, i=0;
    char s[1001];
    scanf("%d %s", &x, s);
    
    for(i=0; s[i]!='.'; i++)
        l=l*10 + (s[i]-'0');

    i++;
    
    for(i=i; i<strlen(s); i++)
        r=r*10 + (s[i]-'0');
        
    printf("%d.%d", x*l, x*r);
}