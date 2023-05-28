#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d\n", &n);
    
    char s[18];
    while(n-->0){
        scanf("%s\n", s);
        
        for(int i=0; i<strlen(s); i++){
            if((s[i]-'0')%2==0){
                int j=i+1, ct=0;
                while(j<strlen(s)){
                    if((s[j]-'0')%2==0){
                        
                        char x=s[i];
                        s[i]=s[j];
                        s[j]=x;
                        ct++;
                        
                        break;
                    }
                    j++;
                    ct++;
                }
                i+=ct;
            }
        }
        
        printf("%ld\n", atol(s));
    }
}