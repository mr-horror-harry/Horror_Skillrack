#include<stdio.h>
#include<stdlib.h>

int main()
{
    char n, j, i, tp, bt;
    scanf("%hhu\n", &n);
    
    char ar[n], max=1;
    
    for(char i=0; i<n; i++){
        scanf("%hhu", &ar[i]);
        if(ar[i] > max)
            max=ar[i];
    }
    
    char mt[max][n];
    
    for(j=0; j<n; j++){
        bt = ar[j];
        tp = max-ar[j];
        
        for(i=0; tp>0; tp--, i++)
            mt[i][j]='-';
            
        for(i=max-1; bt>0; bt--, i--)
            mt[i][j]='#';
    }
    
    for(i=0; i<max; i++){
        for(j=0; j<n; j++)
            printf("%c ", mt[i][j]);
        printf("\n");
    }

}