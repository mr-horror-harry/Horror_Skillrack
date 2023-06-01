#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[10001];
    short n, ct;
    scanf("%s %hi", s, &n);
    
    short i=0,j=n-1;
    char tmp;
    while(i<strlen(s)){
        tmp=s[i];
        s[i]=s[j];
        s[j]=tmp;
        
        i=j+1;
        j=i+n-1;
    }
    printf("%s ", s);
}