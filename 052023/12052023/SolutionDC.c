#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[19];
    short n;
    scanf("%s\n%hi", s, &n);
    
    char *ptr=s;
    while(*ptr != '\0'){
        printf("%hi", *ptr++ - '0' + n);
    }

}