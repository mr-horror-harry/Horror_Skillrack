#include<stdio.h>
#include<stdlib.h>

void printRes(int n, int *mat){
	
	for(int i=0; i<n*n; i+=n+1){
		printf("%d ", *(mat+i));	
	}
	
}

int main(){
	int n;
	scanf("%d ",&n);

	int mat[n][n];

	for(int i=0; i<n; i++){
		for(int j=0; j<n; j++){
			scanf("%d", &mat[i][j]);
		}
	}

	printRes(n, mat);
    return 0;
}