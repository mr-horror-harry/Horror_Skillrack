#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n, ar[n], x;
    
    scanf("%d ",&n);
    for(int i=0; i<n; i++) scanf("%d ",&ar[i]);
    scanf("%d ",&x);
    
    while(n-->0){
        if(ar[n] < x){
            printf("no");
            return 1;
        }
    }
    printf("yes");
    return 1;
}