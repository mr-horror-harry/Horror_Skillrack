#include<stdio.h>
#include<stdlib.h>

int main()
{
    long int n, res=0;
    short x, i=0;
    
    scanf("%ld %hi", &n, &x);
    
    while(i<x){
        if(n%2==1)
            res+=pow(2, i);
        n/=2;
        i++;
    }
    
    printf("%ld", res);
    return 1;

}