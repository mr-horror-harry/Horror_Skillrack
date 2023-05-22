#include<stdio.h>
#include<stdlib.h>

int main()
{
    
    int x,y,n;
    scanf("%d %d %d", &x, &y, &n);
    
    int mul=1;
    while(n>0){
        printf("%d ", x*mul);
        n--;
        
        if(n>0) printf("%d ", y*mul);
        n--;
        
        mul++;
    } 
}