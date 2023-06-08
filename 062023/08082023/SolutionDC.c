#include<stdio.h>
#include<stdlib.h>

void rep(int n){
    while(n>0){
        printf("*");
        n/=10;
    }
    printf(" ");
}

int main()
{
    short n, i, j;
    int x;
    scanf("%hi", &n);
    
    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
            scanf("%d ", &x);
            if(x%10==0){
                printf("%d ", x);
                continue;
            }
            x%(x%10)==0 ? rep(x) : printf("%d ", x);
        }
        printf("\n");
    }
    return 0;

}