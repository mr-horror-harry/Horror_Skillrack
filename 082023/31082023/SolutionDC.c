#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d", &n);
    
    while(n/10%10%2 != 1)
        n/=10;
    
    printf("%d", n);
}