#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    
    int ar[n], max=1;
    for(int i=0; i<n; i++){
        scanf("%d ",&ar[i]);
        
        if(ar[i]>max) max=ar[i];
    }
    
    for(int i=0; i<n; i++) printf("%d ",max - ar[i]);

}