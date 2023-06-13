#include<stdio.h>
#include<stdlib.h>

int reverse(int n){
    int res=0;
    while(n>0){
        res = res*10 + n%10;
        n/=10;
    }
    return res;
}

int main()
{
    short m,n,i,j,k;
    scanf("%hi %hi\n", &m, &n);
    
    int mat[m][n], val, tmp;
    
    
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            scanf("%d ", &mat[i][j]);
            mat[i][j] = reverse(mat[i][j]);
        }
    }
    
    for(j=0; j<n; j++){
        
        for(i=0; i<m-1; i++){
            for(k=i+1; k<m; k++){
                if(mat[i][j] > mat[k][j]){
                    tmp = mat[i][j];
                    mat[i][j] = mat[k][j];
                    mat[k][j] = tmp;
                }
            }
        }
        
    }
    
    for(i=0; i<m; i++){
        for(j=0; j<n; j++)
            printf("%d  ", mat[i][j]);
        printf("\n");
    }

}