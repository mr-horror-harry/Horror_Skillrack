#include<stdio.h>
#include<stdlib.h>

int main()
{
    short a=0,e=0,i=0,o=0,u=0;
    
    char s[101];
    scanf("%s ",&s);
    char *ptr = &s;
    
    for(short p=0; p<strlen(s); p++){
        char c=tolower(*(ptr++));
        
        if(c=='a') a=1;
        else if(c=='e') e=1;
        else if(c=='i') i=1;
        else if(c=='o') o=1;
        else if(c=='u') u=1;
        
        if(a!=0 && e!=0 && i!=0 && o!=0 && u!=0){
            printf("yes");
            return 0;
        }
    }
    printf("no");
    return 0;
}