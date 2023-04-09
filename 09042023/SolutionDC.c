#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d\n", &n);
    
    int s=2;
    while(n-->0){
        for(int i=0; i<n; i++) printf("%c",'-');
        for(int i=0; i<s; i++) printf("%c",'*');
        for(int i=0; i<n; i++) printf("%c",'-');
        printf("\n");
        s+=2;
    }

}