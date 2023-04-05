#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[101];
    scanf("%[^\n]s ", &s);
    
    int ct=0, f=0;
    for(int i=0; i<strlen(s); i++){
        
        if(s[i] == ' '){
            ct += f==0 ? 1 : 0;
            // printf(" c:%d f:%d\n", ct, f);
            f=0;
        }
        else{
            if( !(s[i]>='a' && s[i]<='z') )
                f=1;
                //printf("%c", s[i]);
        }
    }
    ct += f==0 ? 1 : 0;     // for last word (or with 1st if(... || i==strlen(s)) ==> timecplx)
    printf("%d",ct);

}