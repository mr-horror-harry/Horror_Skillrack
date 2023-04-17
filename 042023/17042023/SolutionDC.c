//Soln using pointers also

#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[1001];
    scanf("%s ",&s);
    char *ptr=s;
    
    short vow, con;

    for(short i=0; i<strlen(s); i++){
        char c=*(ptr+i);
        
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') vow++;
        else con++;
        
    }
    
    if(vow==con) printf("%s ",s);
    else if(vow>con)
        for(short i=0; i<strlen(s); i++){
            char c=s[i];
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                printf("%c",s[i]);
        }
    else
        for(short i=0; i<strlen(s); i++){
            char c=s[i];
            if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'))
                printf("%c", s[i]);
        }
        
    return 0;
}