#include<stdio.h>
#include<stdlib.h>

int main()
{
    int x, y;
    scanf("%d %d", &x, &y);
    
    int set[100001]={0}, ptr=0, f, i, j ,k, tmp;
    
    for(i=x; i<=y; i++){
        for(j=1; j*j<=i; j++){
            if(i%j==0){
                
                f=0;
                for(k=0; k<ptr; k++)
                    if(set[k]==j){
                        f=1;
                        break;
                    }
                if(f==0)
                    set[ptr++]=j;
                    
                f=0;
                for(k=0; k<ptr; k++)
                    if(set[k]==i/j){
                        f=1;
                        break;
                    }
                if(f==0)
                    set[ptr++]=i/j;
            }
        }
    }
    
    for(i=0; i<ptr; i++)
        for(j=i+1; j<ptr; j++)
            if(set[j]<set[i]){
                tmp=set[j];
                set[j]=set[i];
                set[i]=tmp;
            }
    
    for(i=0; i<ptr; i++)
        printf("%d ", set[i]);
}