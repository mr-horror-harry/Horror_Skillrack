#include<stdio.h>
#include<stdlib.h>

int main()
{
    short n;
    scanf("%hi ", &n);
    
    short i, ct, st=n-1, val;
    if(n<0){
        i=1;
        val=1;
        n*=-1;
        while(i<=n){
            ct=0;
            for(short j=0; j<n-i; j++) printf("%c ", '*');
            for(short j=val+i-1; ct<i; j--, ct++) printf("%hi ", j);
            printf("\n");
            val+=i++;
        }
    }else{
        i=1;
        val=1;
        while(i<=n){
            ct=0;
            while(ct++ < i) printf("%hi ", val++);
            for(short j=0; j<n-i; j++) printf("%c ", '*');
            printf("\n");
            i++;
        }
    }
}