#include<stdio.h>
#include<stdlib.h>

int main()
{
    short n;
    scanf("%hi ", &n);
    short mt[n][n];
    
    short val=1;
    for(short i=0; i<n; i++)
        mt[n-1][n-i-1] = (mt[n-i-1][n-1] = (mt[i][0] = (mt[0][i]=val++) ) );
        
    for(short i=0; i<n; i++){
        for(short j=0; j<n; j++){
            if(i==0 || j==0 || i==n-1 || j==n-1)
                printf("%hi ", mt[i][j]);
            else
                printf("%c ", '*');
        }
        printf("\n");
    }
}