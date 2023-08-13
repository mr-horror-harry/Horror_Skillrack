#include<stdio.h>
#include<stdlib.h>

char Upper(char c);

int main()
{
    char c, x='A';
    short i=0, ct=1;
    scanf("%c", &c);
    
    c = Upper(c);
    
    while(x <= c){
        for(i=0; i<ct; i++)
            printf("%c ", x);
        
        printf("\n");
        x++;
        ct++;
    }

}

char Upper(char c){
    return c>='A' && c<='Z' ? c : c-32;
}