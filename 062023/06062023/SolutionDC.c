#include <stdio.h>
#include <stdlib.h>

int main()
{
    short n, i, j;
    int k;
    scanf("%hi %d\n", &n, &k);
    int mt[n][n];
    
    for(i=0; i<n; i++) for(j=0; j<n; j++) scanf("%d", &mt[i][j]);
    
    short ct;
    for(j=0; j<n; j++){
        ct=0;
        for(i=0; i<n; i++){
            
            if(ct==2)
                mt[i][j]=0; 
            if(mt[i][j]==k && ct!=2)
                ct++;
                
        }
    }
    
    for(i=0; i<n; i++){
        for(j=0; j<n ;j++)
            mt[i][j]==0 ? printf("* ") : printf("%d ", mt[i][j]);
        printf("\n"); 
    }
    
    return 0;
}
