#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d\n", &n);
    
    int ar[n];
    for(short i=0; i<n; i++) scanf("%d ", &ar[i]);
    
    short m=n/2;
    
    if(n%2==0) printf("%d %d %d %d",ar[m-2], ar[m-1], ar[m], ar[m+1]);
    else printf("%d %d %d", ar[m-1], ar[m], ar[m+1]);

}