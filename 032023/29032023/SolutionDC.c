#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[1001];
    scanf("%s ", &s);
    
    int res=0;
    for(int i=0; i<strlen(s); i++){
        res+= s[i]=='+'  ? 1 : -1;
    }
    
    printf("%d ",res >= 0 ? res : res*(-1));
}