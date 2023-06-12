#include <stdio.h>

int isPresent(int m, int n)
{
    int x=m, y=n, f, tmp;
    
    while(x>0){
        if(x%10 == y%10){
            f=0;
            tmp=x;
            
            while(x>0 && y>0){
                if(x%10!=y%10){
                    f=1;
                    break;
                }
                x/=10;
                y/=10;
            }
            if(f==0){
                return 1;
            }
            else{
                y=n;
                x=tmp;
            }
        }
        x/=10;
    }
    
    return 0;
}

int main(){
    int m, n;
    scanf("%d %d", &m, &n);
    printf(isPresent(m ,n) ? "Yes" : "No");
}