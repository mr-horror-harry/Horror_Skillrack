#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[101];
    short l;
    scanf("%s %d", &s, &l);
    
    short n=strlen(s);
    
    char *ptr = &s;
    char c='0';
    
    short bCt=0, eCt=0, i,j;
    for(i=0, j=n-1; i<l; i++, j--){
        c = *(ptr+i);
        if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')) bCt++;
        
        c = *(ptr+j);
        if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')) eCt++;
    }
    
    if(bCt==eCt){
        printf("%s", s);
    }
    else if(eCt>bCt){
        printf("%s", ptr+j+1);
    }
    else{
        for(short i=0; i<l; i++) printf("%c", s[i]);
    }
}