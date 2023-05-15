#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    
    int ar[n];
    short bal=0;
    for(short i=0; i<n; i++){
        scanf("%d ", &ar[i]);
        ar[i]%2!=0 ? bal++ : bal--;
    }
    
    if(bal==0){
        for(short i=n-1; i>=0; i--) printf("%d ", ar[i]);
        return;
    }
    if(bal<0){
        for(short i=n-1; i>=0; i--) if(ar[i]%2==0) printf("%d ", ar[i]);
        for(short i=0; i<n; i++) if(ar[i]%2!=0) printf("%d ",ar[i]);
        return;
    }
    for(short i=n-1; i>=0; i--) if(ar[i]%2!=0) printf("%d ",ar[i]);
    for(short i=0; i<n; i++) if(ar[i]%2==0) printf("%d ",ar[i]);
}