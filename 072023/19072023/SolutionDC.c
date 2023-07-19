#include<stdio.h>
#include<stdlib.h>

int main()
{
    
    int n;
    scanf("%d", &n);
    
    int max=0, ct, row=1, j;
    short x;
    
    for(int i=0; i<n; i++){
        ct=0;
        for(j=0; j<n; j++){
            scanf("%hu ", &x);
            if(x==1) ct++;
        }
        if(ct>max){
            max=ct;
            row=i+1;
        }
        
    }
    printf("%d", row);
}