#include<stdio.h>
#include<stdlib.h>

int main()
{
    short n;
    scanf("%hi\n", &n);
    int ar[n];
    
    for(short i=0; i<n; i++) scanf("%d ", &ar[i]);
    
    short x;
    scanf("\n%hi", &x);
    
    for(short i=0; i<n; i++){
        printf("%hi ", i >= n-x ? ar[i]*-1 : ar[i] );
    }
 
}