#include<stdio.h>
#include<stdlib.h>

int main()
{
    
    char s[101];
    scanf("%s", s);
    
    short m=strlen(s)/2, f=0;
    char* ptr;
    
    // Second Half
    ptr = &s[m-1];
    while(*ptr++ != '\0'){
        char c = tolower(*ptr);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            printf("%c", *ptr);
            f=1;
        }
    }
    
    // First Half
    ptr=s;
    for(short i=0; i<m; i++){
        char c = tolower(*(ptr+i));
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            printf("%c", *(ptr+i));
            f=1;
        }
    }
    
    printf(f==0 ? "-1" : "");

}