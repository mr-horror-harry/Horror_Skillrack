#include<stdio.h>
#include<stdlib.h>

short h2d(char x){
    if(x-'0'<10) return x-'0';
    else return x-'A'+10;
}

int main()
{
    char s[7];
    scanf("%s", &s);
    
    printf("(%hi,%hi,%hi)", h2d(s[1])*16 + h2d(s[2]), h2d(s[3])*16 + h2d(s[4]), h2d(s[5])*16 + h2d(s[6]));

}