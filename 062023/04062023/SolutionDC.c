#include<stdio.h>
#include<stdlib.h>

int main()
{
    int m, n;
    scanf("%d %d\n", &m, &n);
    int mt[m][n], tmp;
    short i, j;
    for(i=0; i<m; i++){
        if(i%2==0)                          // Odd Rows
            for(j=0; j<n; j++){
                scanf("%d ", &mt[i][j]);
            }
        else
            for(j=n-1; j>=0; j--){
                scanf("%d ", &mt[i][j]);
            }
    }
    
    for(j=0; j<n; j+=2){
        for(i=0; i<m/2; i++){
            tmp = mt[i][j];
            mt[i][j] = mt[m-i-1][j];
            mt[m-i-1][j] = tmp;
        }
    }
    
    for(i=0; i<m; i++){
        for(j=0; j<n; j++)
            printf("%d ", mt[i][j]);
        printf("\n");    
    }

}