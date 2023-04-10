#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    
    int res, mOff=0;                        //maxOff
    while(n-->0){
        int p, rp;                      //price, resultantPrice
        scanf("%d %d",&p, &rp);
        
        int pDiff = p-rp;               // priceDiff
        if(pDiff > mOff){
            mOff=pDiff;
            res=rp;
        }
        else if(pDiff==mOff){
            if(rp < res){
                res=rp;
            }
        }
    }
    printf("%d", res);
}