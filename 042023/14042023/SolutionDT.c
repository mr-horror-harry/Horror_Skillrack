#include<stdio.h>
#include<stdlib.h>

int main()
{
    int m,n;
    scanf("%d %d",&m, &n);
    int mt[m][n];
    for(int i=0; i<m; i++) 
        for(int j=0; j<n; j++)
            scanf("%d ", &mt[i][j]);
    
    
    for(int i=0; i<m; i++){
        for(int j=0; j<n-1; j++){
            if(mt[i][j+1]%2!=0)
                printf("%d ", mt[i][j]);
            else
                printf("* ");
        }
        printf("* \n");
    }
}