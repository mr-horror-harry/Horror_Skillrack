#include<stdio.h>
#include<stdlib.h>

int main()
{
    char n;
    scanf("%hhu", &n);
    
    char t=0, f=0, amt;
    
    while(n-->0){
        scanf("%hhu ", &amt);
        
        if(amt==25)
            t++;
        else if(amt==50){
            if(t>0){
                f++;
                t--;
            }
            else{
                printf("NO");
                return;
            }
        }
        else{
            if(t>0 && f>0){ // to give away Rs.50/- priorly to save Rs.25/- for change
                t--;
                f--;
            }
            else if(t>2){
                t-=3;
            }
            else{
                printf("NO");
                return;
            }
        }
    }
    printf("YES");
}