#include<stdio.h>
#include<stdlib.h>

int main()
{
    char x;
    int n;
    scanf("%c %d",&x, &n);
    
    char res[26];
    int i=0;
    while(x<='z' && n-->0) res[i++]=(char) x++;
    while(--i>=0) printf("%c", res[i]);

}