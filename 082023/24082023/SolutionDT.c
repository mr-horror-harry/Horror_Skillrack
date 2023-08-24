#include<stdio.h>
#include<stdlib.h>

int main()
{
    short n, i, j;
    scanf("%hu", &n);
    
    short ar[1000];
    int sum;
    
    for(i=0; i<n; i++)
        scanf("%hu", &ar[i]);
        
    for(i=0; i<n-1; i++){
        sum=0;
        for(j=i+1; j<n; j++)
            if(ar[j]<ar[i])
                sum+=ar[j];
                
        printf("%d ", sum);
    }
    printf("%hhu", 0);
}