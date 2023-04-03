#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d\n", &n);
    
    char s[251];
    scanf("%[^\n]s", &s);
    int ptr=0, ct=0;
    
    for(int i=0; ct<n && i<=strlen(s); i++){
        if(s[i]==' '){
            ct++;
            ptr=i;
        }
        if(i==strlen(s)){
            ct++;
            ptr=i;
            break;
        }
    }
    
    for(int i=ptr-1; i>=-1; i--){
        if(s[i]==' ' || i==-1){
            int j=i+1;
            while(s[j]!=' ' && j<strlen(s)-1){
                printf("%c",s[j]);
                j++;
            }
            i--;
            printf(" ");
        }
    }
    
    while(ptr<strlen(s)-1) printf("%c", s[++ptr]);
}