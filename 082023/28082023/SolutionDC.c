#include<stdio.h>
#include<stdlib.h>

int main()
{
    char n[8], ct, i;
    scanf("%s\n%hhu", n, &ct);
    
    
    for(i=0; ct>0 && i<strlen(n); i++){
        if(i==0){
            if(n[i]!='1'){
                n[i]='1';
                ct--;
            }
        }
        else{
            if(n[i]!='0'){
                n[i]='0';
                ct--;
            }
        }
    }
    printf("%s", n);
}