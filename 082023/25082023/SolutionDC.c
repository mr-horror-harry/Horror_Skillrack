#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n, i=0, x, sum=0;
    scanf("%d\n", &n);
    
    int ar[n];
    for(i=0; i<n; i++){
        scanf("%d ", &ar[i]);
    }
    
    scanf("%d", &x);
    
    int ct=pow(2, x);
    
    i=x-1;
    while(ct>0 && i<n){
        sum+=ar[i];
        i++;
        ct--;
    }
    
    printf("%d", sum);
}