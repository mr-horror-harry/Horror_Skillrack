#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d\n", &n);
   
    int f=1, val=1;
   
    for(int i=1; i<=n; i++){
        int ct=1;
        if(f==1){
            for(int j=val+n; ct<=n; ct++){
                printf("%d ",--j);
            }
            f=0;
        }
        else{
            for(int j=val; ct<=n; ct++){
                printf("%d ", j++);
            }
            f=1;
        }
        printf("\n");
        val += n;
    }
}
