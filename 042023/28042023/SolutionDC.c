#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d\n", &n);
    int mt[n][n];
    
    int sum=0;
    short i,j;
    for( i=0; i<n; i++){
        for( j=0; j<n; j++){
            scanf("%d ", &mt[i][j]);
            if(i==j || i+j==n-1) sum+=mt[i][j];
        }
    }
    
    for(i=0; i<n; i++){
        for(j=0; j<n; j++)
            printf("%d ",i==j || i+j==n-1 ? sum : mt[i][j]);
        printf("\n");
    }

}