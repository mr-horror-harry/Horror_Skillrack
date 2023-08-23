#include<stdio.h>
#include<stdlib.h>

int main()
{
    char n;
    scanf("%hhu", &n);
    
    char mt[n][n];
    char ct=n-1;
    
    char si=0, sj=0, pi=0, pj=n-1, mi=n-1, mj=n-1, hi=n-1, hj=0;
    char s1, s2, p1, p2, m1, m2, h1, h2;
    
    char i,j;
    
    for(i=0; i<n/2; i++){
        
        s1=si; s2=sj;
        p1=pi; p2=pj;
        m1=mi; m2=mj;
        h1=hi; h2=hj;
        
        for(j=0; j<ct; j++){
            mt[s1][s2] = '*';
            mt[p1][p2] = '+';
            mt[m1][m2] = '-';
            mt[h1][h2] = '#';
            
            s2++; p1++; m2--; h1--;
        }
        
        si++; sj++;
        pi++; pj--;
        mi--; mj--;
        hi--; hj++;
        
        ct-=2;
    }
    
    for(i=0; i<n; i++){
        for(j=0; j<n; j++)
            printf("%c ", mt[i][j]);
        
        printf("\n");
    }
}