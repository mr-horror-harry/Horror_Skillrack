#include<stdio.h>
#include<stdlib.h>

int main()
{
    short n;
    scanf("%hi\n", &n);
    
    short ar[n];
    short min=10000, pos=0;
    for(short i=0; i<n; i++){
        scanf("%hi ", &ar[i]);
        
        if(ar[i]<min){
            min=ar[i];
            pos=i;
        }
        
    }
    
    for(short i=0; i<=pos; i++){
        printf("%hi ", ar[i]);
    }
}