#include<stdio.h>
#include<stdlib.h>

int main()
{
    short n;
    int k;
    
    int x;
    scanf("%hi %d\n", &n, &k);
    
    while(n-->0){
        scanf("%d ", &x);
        printf("%d ", x%10==k%10 ? x+k : x-k);   
    }
}