#include<stdio.h>
#include<stdlib.h>

int main()
{
    unsigned short n,x,y,z;
    
    scanf("%hu %hu %hu %hu", &n, &x, &y, &z);
    unsigned short val=1;
    
    while(n>0){
        
        if(val%x==0 && !(val%y==0 || val%z==0)){
            printf("%hu ", val);
            n--;
        }
        else if(val%y==0 && !(val%x==0 || val%z==0)){
            printf("%hu ", val);
            n--;
        }
        else if(val%z==0 && !(val%x==0 || val%y==0)){
            printf("%hu ", val);
            n--;
        }
        val++;
        
    }
}