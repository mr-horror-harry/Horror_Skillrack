//Solution Using pointers

#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[101];
    scanf("%s",&s);
    
    short len=strlen(s);
    char* ptr=&s;           // char ptr and npt int ptr
    
    for(short i=0; i<len; i++)
        if(len%(i+1)==0)    
            printf("%c", *(ptr+i));

    return 0;
}