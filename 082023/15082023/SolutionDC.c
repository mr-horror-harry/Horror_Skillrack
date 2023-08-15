#include<stdio.h>
#include<stdlib.h>

_Bool isChangable(char c){
    c=tolower(c);
    return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c>='0' && c<='9';
}

int main()
{
    char s[100];
    scanf("%s", s);
    
    for(short i=0; i<strlen(s); i++)
        printf("%c", isChangable(s[i]) ? '*' : s[i] );
}