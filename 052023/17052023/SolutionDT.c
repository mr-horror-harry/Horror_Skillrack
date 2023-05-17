#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d ", &n);
    
    int mt[n][n], res[n][n];
    
    for(int i=0; i<n; i++)
        for(int j=0; j<n; j++)
            scanf("%d " ,&mt[i][j]);
            
    for(int i=0; i<n; i++){
        int r=mt[0][i]-1;
        for(int j=0; j<n; j++){
            res[j][i] = mt[r][j];
        }
    }
    
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++)
            printf("%d ", res[i][j]);
        printf("\n");
    }       
}