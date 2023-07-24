#include<stdio.h>
#include<stdlib.h>

void repeatChar(char c, short t){
    while(t-->0)
        printf("%c", c);
}

int main(){
    char s[8], ar[9];
    scanf("%s", &s);
    
    for(short i=0; i<strlen(s)-1; i++)
        repeatChar(s[i], s[i+1]-'0');
}