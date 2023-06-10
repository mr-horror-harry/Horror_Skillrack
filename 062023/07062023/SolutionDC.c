#include<stdio.h>
#include<stdlib.h>

int main()
{
    float m, n;
    scanf("%f %f", &m, &n);
    
    short ct=0;
    while(n<m){
        ct++;
        n += n*0.25;
    }
    printf("%hi ", ct);
}