#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[10001];
    int x;
    scanf("%s %d", &s, &x);
    
    int l=strlen(s), i, p=0;
    char ar[2*l];
    
    for(i=l-1; i>=0; i--)
        ar[p++] = s[i];
        
    for(i=0; i<l; i++)
        ar[p++] = s[i];
    
    int ct=x/(2*l), r=x%(2*l);
    
    while(ct-->0)
        for(int i=0; i<2*l; i++)
            printf("%c", ar[i]);
            
    for(int i=0; i<r; i++)
        printf("%c", ar[i]);
}