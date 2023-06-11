#include<stdio.h>
#include<stdlib.h>

int main()
{
    
    int n;
    scanf("%d ", &n);
    
    char ar[101];
    short i=0;
    while(n>0){
        ar[i++] = n%2 + '0';
        n/=2;
    }
    
    short p=0;
    while(p < i/2){
        if(ar[i-p-1] != ar[p++]){
            printf("NO");
            return 1;
        }
    }
    printf("YES");
    return 1;
}