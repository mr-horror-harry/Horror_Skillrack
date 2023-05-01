#include<stdio.h>
#include<stdlib.h>

int main()
{
    short n;
    scanf("%hi", &n);
    
    short ct=1;
    char c='a';
    while(n>0){
        
        for(short i=0; i<n; i++) printf("%c ", c++);
        for(short i=0; i<ct; i++) printf("* ");
        for(short i=0; i<n; i++) printf("%c ", c--);
        
        n--;
        ct+=2;
    }

}