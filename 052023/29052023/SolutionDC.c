#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d\n", &n);
    
    int i, x, min=100000, max=1;
    for(i=0; i<n; i++) {
        scanf("%d ", &x);
        if(x>max) max=x;
        if(x<min) min=x;
    }
    printf("%d %d", max<min ? max,min : min,max);
}