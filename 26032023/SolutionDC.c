#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[101];
    scanf("%s",&s);
    
    int hash[101]={0};
    
    for(int i=0; i<strlen(s); i++){
        for(int j=i+1; j<strlen(s); j++){
            if(s[i]==s[j]+32 || s[i]==s[j]-32){
                hash[i]=1;
                hash[j]=1;
            }
        }
    }
    
    for(int i=0; i<strlen(s); i++)
        if(hash[i]==1)
            printf("%c", s[i]);

}