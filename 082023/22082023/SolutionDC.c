#include<stdio.h>
#include<stdlib.h>

void substring(char* s, short i, short j){
    while(i<j)
        printf("%c", s[i++]);
}
 
int main(){
    
    char s[100];
    short n;
    
    scanf("%s\n%hu", s, &n);
    
    n = n%strlen(s);
    
    substring(s, n, strlen(s));
    substring(s, 0, n);
    return 0;
    
}