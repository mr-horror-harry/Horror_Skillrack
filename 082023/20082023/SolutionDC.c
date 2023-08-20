#include<stdio.h>
#include<stdlib.h>

int main()
{
    int x, ct=0;
    
    while(scanf("%d ", &x)==1)
        if(x%2!=0)    
            ct++;
    
    printf("%d ", ct);

}