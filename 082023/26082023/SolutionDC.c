#include<stdio.h>
#include<stdlib.h>

int main()
{
    int a, b, x, y;
    scanf("%d %d %d %d",&a, &b, &x, &y);
    
    printf("%s", a+b==x+y || a+x==b+y || a+y==b+x ||
                    a==b+x+y || b==a+x+y || x==a+b+y || y==a+b+x ? "YES" : "NO");
}