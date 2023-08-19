#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s1[100], s2[100];
    scanf("%s %s", s1, s2);
    short j;
    _Bool f;
    
    for(short i=0; i<strlen(s1); i++){
        f=1;
        for(j=0; j<strlen(s2); j++){
            if(s1[i]==s2[j]){
                f=0;
                break;
            }
        }
        
        if(f){
            printf("%c", s1[i]);
            return;
        }
    }
    
    printf("-1");

}