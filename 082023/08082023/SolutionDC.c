#include<stdio.h>
#include<stdlib.h>

int main()
{
    
    int x, y;
    scanf("%d %d", &x, &y);
    
    if(x<=y)
        x = y;
        
    for(y=1; y<=10; y++)
        printf("%d ", x * y);

}