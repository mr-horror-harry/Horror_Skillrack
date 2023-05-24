#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>

short isVowel(char c){
    return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
}

int main()
{
    short n;
    scanf("%hi ", &n);
    
    char a[n][n], b[n][n];
    short aC=0, bC=0;
    for(short i=0; i<n; i++)
        for(short j=0; j<n; j++){
            scanf("%c ", &a[i][j]);
            if(isVowel(tolower(a[i][j]))) aC++;
        }
    for(short i=0; i<n; i++)
        for(short j=0; j<n; j++){
            scanf("%c ", &b[i][j]);
            if(isVowel(tolower(b[i][j]))) bC++;
        }
    char *ptr;
    short ct=0;
    if(aC>=bC){
        ptr=a;
        ct=0;
        while(ct<n*n){
            printf("%c ", *ptr++);
            if(++ct % n==0) printf("\n");
        }
    }
    else{
        ptr=b;
        ct=0;
        while(ct<n*n){
            printf("%c ", *ptr++);
            if(++ct % n==0) printf("\n");
        }
    }
}