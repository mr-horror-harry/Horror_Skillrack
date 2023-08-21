#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[1000], tmp;
    short n, i, j;
    
    scanf("%s\n%d\n", s, &n);
    
    while(n-->0){
        scanf("%hu %hu\n", &i, &j);
        i--;
        j--;
        
        tmp=s[i];
        s[i]=s[j];
        s[j]=tmp;
    }
    
    printf("%s", s);
    return 1;
}