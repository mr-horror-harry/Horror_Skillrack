#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n, x;
    scanf("%d %d", &n, &x);
    
    _Bool f=1;
    
    for(int i=x; i<=n; i++){
        if(n%i==0 && i%x==0){
            f=0;
            printf("%d ", i);
        }
    }
    
    if(f)
        printf("-1");

}