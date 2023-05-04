#include<stdio.h>
#include<stdlib.h>

short isConst(char c){
    return !(c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
}

int main()
{
    char s[1001];
    scanf("%s", s);
    
    char* ptr=s;
    int ct=0;
    for(short i=0; i<strlen(s)-1; i++)
        if(isConst( tolower(*(ptr+i)) ) && isConst( tolower(*(ptr+i+1)) ))
            ct++;

    printf("%d", ct);
    
}
