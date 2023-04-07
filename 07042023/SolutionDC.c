#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[17];
    scanf("%s",&s);
    
    int ct=strlen(s)/2;
    for(int i=0; ct>0; i+=2){
        char tmp=s[i+1];
        s[i+1]=s[i];
        s[i]=tmp;
        
        ct--;
    }
    printf("%lld", atoll(s));
}