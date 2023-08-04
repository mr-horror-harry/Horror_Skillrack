#include<stdio.h>
#include<stdlib.h>

_Bool isVowel(char c){
    return c=='a' || c=='e' || c=='i' || c=='o'|| c=='u';
}

int main()
{
    char s[101];
    scanf("%s", s);
    
    for(short i=0; i<strlen(s)-1; i++){
        if(!isVowel( tolower(s[i]) ))
        // {
            if(isVowel( tolower(s[i+1]) )){
                printf("%c%c ", s[i], s[i+1]);
                i++;
            }
            // else
            //     i++;
        // }
        // else
        //     i++;
    }
    

}