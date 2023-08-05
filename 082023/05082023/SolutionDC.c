#include<stdio.h>
#include<stdlib.h>

int tensLarge(int x){
    return x/10%10;
}

int large(int x, int y){
    return x > y ? x : y;
}

int main()
{
    int x,y,z, res;
    scanf("%d %d %d", &x, &y, &z);
    
    res=x;
    
    res = tensLarge(y) > tensLarge(res) ? y :
            tensLarge(y) == tensLarge(res) ? large(res, y) :
                res;
                
    res = tensLarge(z) > tensLarge(res) ? z : 
            tensLarge(z) == tensLarge(res) ? large(res, z) :
                res;
                
    
    printf("%d", res);
    return 1;
}