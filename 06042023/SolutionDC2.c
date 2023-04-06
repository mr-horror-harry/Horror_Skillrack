#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    
    int val=1, dash=0, r=1, beg, end, inc;
    while(n>0){
        for(int i=0; i<dash; i++) printf("- ");
        dash++;
        
        int lim=val;
        if(r%2==1){
            beg=lim; end=lim+n; inc=1;
        }else{
            beg=lim+n-1; end=lim-1; inc=-1;
        }
        
        int ct=0;
        for(int i=beg; i!=end; i+=inc){
            printf("%d ", i);
            printf(ct < n-1 ? "* " : "");
            val++;
            ct++;
        }
        printf("\n");
        r++;
        n--;
    }

}