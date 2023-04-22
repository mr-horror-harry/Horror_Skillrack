#include<stdio.h>
#include<stdlib.h>

int main()
{
    short m,n;
    scanf("%d %d\n", &m, &n);
    char c;
    
    while(m-->0){
        short a=0, e=0, i=0, o=0, u=0;
        for(short p=0; p<n; p++){
            
            scanf("%c ", &c);
            
                 if(c=='a') a=1;
            else if(c=='e') e=1;
            else if(c=='i') i=1;
            else if(c=='o') o=1;
            else if(c=='u') u=1;
            
        }
        if( !(a==1 && e==1 && i==1 && o==1 && u==1) ){
            printf("NO");
            return;
        }
    }
    printf("YES");

}