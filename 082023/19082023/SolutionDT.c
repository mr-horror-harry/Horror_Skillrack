#include<stdio.h>
#include<stdlib.h>

int pow2(int ct){
    int res=2;
    while(ct-->1)
        res*=2;
        
    return res;
}

int main()
{
    int x, ct=0;
    scanf("%d", &x);
    
    while(x>0){
        if(x%2==1)
            ct++;
    
        x/=2;
    }
    
    printf("%d", pow2(ct)-1);

}