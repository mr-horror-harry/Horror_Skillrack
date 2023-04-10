#include<stdio.h>
#include<stdlib.h>

int main()
{
    int m,n;
    scanf("%d %d\n",&m, &n);
    
    int mt[m][n];
    
    for(int i=0; i<m; i++)
        for(int j=0; j<n; j++)
            scanf("%d ",&mt[i][j]);
            
    
    for(int i=0; i<m-1; i++){
        for(int j=0; j<n-1; j++){
            printf("%d ",mt[i+1][j]+mt[i][j+1]);   // first n-1 elts of each row
        }
        
        printf("%d\n", mt[i+1][n-1]);               // last elt of each row
    }
    
    for(int j=0; j<n-1; j++) printf("%d ",mt[m-1][j+1]);      // first n-1 elts of last row
    
    printf("%d ", mt[m-1][n-1]);        // last elt

}