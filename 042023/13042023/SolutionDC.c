#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d ",&n);
    
    int val=1;
    for(int i=n-1; i>=0; i--){
        for(int j=0; j<i; j++) printf("*");
        
        for(int j=0; j<n-i; j++) printf("%d",val++);
        printf("\n");
    }

}