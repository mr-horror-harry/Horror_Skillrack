#include<stdio.h>
#include<stdlib.h>

_Bool isCapsVow(char c){
    return c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
}

_Bool isLowCons(char c){
    return c=='b' || c=='c' || c=='d' || c=='f' || c=='g' || c=='h' || c=='j' || c=='k' || c=='l' || c=='m' || c=='n' || c=='p' || c=='q' || c=='r' || c=='s' || c=='t' || c=='v' || c=='w' || c=='x' || c=='y' || c=='z'; 
}

int main()
{
    char s[101];
    scanf("%s", &s);
    _Bool f=1;
    
    for(int i=0; i<strlen(s); i++)
        if(isCapsVow(s[i]) || isLowCons(s[i])){
            printf("%c", s[i]);
            f=0;
        }
    if(f)
        printf("-1");

}