#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d ",&n);
    
    int val=1, dash=0, r=1;
    while(n>0){
        for(int i=0; i<dash; i++) printf("- ");
        dash++;
        
        int lim=val;
        if(r%2==1){
            for(int i=lim; i<lim+n; i++){
                printf("%d ", i);
                printf(i<lim+n-1 ? "* " : "");
                val++;
            }
        }else{
            for(int i=lim+n-1; i>=lim; i--){
                printf("%d ",i);
                printf(i>lim ? "* " : "");
                val++;
            }
            
        }
        printf("\n");
        r++;
        n--;
    }

}
