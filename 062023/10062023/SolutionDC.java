#include<stdio.h>
#include<stdlib.h>

int main()
{
    short n;
    scanf("%hi", &n);
    
    short mt[n][n];
    short c0=0, c1=0, i, j;
    
    for(i=0; i<n; i++)
        for(j=0; j<n; j++)
            scanf("%hi ", &mt[i][j]);
    
    for(i=1; i<n-1; i++){
        for (j=1; j<n-1; j++){
            if(mt[i][j]==0 && mt[i-1][j]==1 && mt[i+1][j]==1 && mt[i][j+1]==1 && mt[i][j-1]==1)
                c0++;
            else if(mt[i][j]==1 && mt[i][j+1]==0 && mt[i][j-1]==0 && mt[i+1][j]==0 && mt[i-1][j]==0)
                c1++;
        }
    }
    printf("%hi %hi", c0, c1);
}
