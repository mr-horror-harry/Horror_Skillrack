#include <stdio.h>

int main()
{
    long n;
    scanf("%ld",&n);
    n++;
    while(n%10==0) n/=10;
    printf("%ld",n);
    return 0;
}
