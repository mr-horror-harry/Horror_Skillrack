#include<stdio.h>
#include<stdlib.h>

int main()
{
    short m,n;
    scanf("%hi %hi\n", &m, &n);
    int mt[m][n];
    for(short i=0; i<m; i++){
        for(short j=0; j<n; j++){
            scanf("%d ", &mt[i][j]);
        }
    }
    
    short r;
    scanf("%hi", &r);
    
    for(short k=0; k<m; k++){
        for(short i=n-r, j=n-1; i<j; i++, j--){
            int tmp = mt[k][i];
            mt[k][i] = mt[k][j];
            mt[k][j] = tmp;
        }
        
        for(short i=0; i<n; i++){
            printf("%d ", mt[k][i]);
        }
        printf("\n");
    }
}