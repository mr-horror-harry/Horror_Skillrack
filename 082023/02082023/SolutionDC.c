#include<stdio.h>
#include<stdlib.h>

_Bool isCons(char c){
    return !(c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
}

int main()
{
    char x, y;
    scanf("%c %c", &x, &y);
    
    while(x!=y){
        if(isCons(x))
            printf("%c ", x);
            
        x<=y ? x++ : x--;
    }
    printf("%c ", isCons(x) ? x : ' ');
    
    return 1;
}