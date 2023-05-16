#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    short x;
    scanf("%ld %hi", &n, &x);
    
    short ar[31], ct=0;
    while(n>0){
        ar[ct++] = n%2==0 ? '0' : '1';
        n/=2;
    }
    if(ct>x){
        printf("%hi", -1);
        return;
    }
    
    while((x--)-ct>0) printf("%c",'0');
    ct--;
    while(ct>=0) printf("%c", ar[ct--]);
}