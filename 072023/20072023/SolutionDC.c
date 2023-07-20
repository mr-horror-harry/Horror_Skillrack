#include<stdio.h>
#include<stdlib.h>

int main()
{
    short m, n;
    scanf("%hu %hu", &m, &n);
    
    while(n>0){
        printf("%hi * %hi = %d\n", n, m, n * m);
        n--;
    }

}