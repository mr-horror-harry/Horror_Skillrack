#include<stdio.h>
#include<stdlib.h>

void print(char c, short n){
    while(n-->0) printf("%c ", c);
}

void printNos(short i, short n){
    for(short j=i; j<=n; j++){
        printf("%d ", j);
    }
    for(short j=n-1; j>=i; j--){
        printf("%d ", j);
    }
    printf("\n");
}

int main()
{
    short n;
    scanf("%d", &n);
    
    for(short i=1; i<=n; i++){
        print('*', i-1);
        printNos(i, n);
    }

}