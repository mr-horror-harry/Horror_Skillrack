// Time Complec=xity grows logarithmically when strlen increases
#include<stdio.h>
#include<string.h>

int main()
{   
    char s[101];
    short n;
    scanf("%s\n%ui ", &s, &n);
    
    for(short i=strlen(s); i>=1; i--)
        if(i%n==0){
            while(i>=1){
                printf("%c", s[i-1]);
                i-=n;
            }
            return;
        }
}