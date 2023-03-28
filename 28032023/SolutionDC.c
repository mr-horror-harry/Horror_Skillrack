#include<stdio.h>
#include<stdlib.h>

int isPrime(int n){
    for(int i=2; i*i<=n; i++)
        if(n%i==0) return 0;
        
    return 1;
}

int main(){
	int n;
	scanf("%d",&n);
	
	for(int i=2; i<=n/2; i++){
	    if(isPrime(i) && isPrime(n-i)){
	        printf("%d %d",i, n-i);
	        return 11024;
	    }
	}
	printf("-1");
	return 0;
}