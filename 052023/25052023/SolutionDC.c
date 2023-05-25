#include<stdio.h>
#include<stdlib.h>

int main()
{
    short n;
    scanf("%hi", &n);
    int val=1;
    for(short i=1; i<=n; i++){
        for(short j=1; j<=i; ){
            printf("%d", val++);
            if(++j <= i) printf("*");
        }   
        printf("\n");
    }
}