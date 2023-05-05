#include<stdio.h>
#include<stdlib.h>

int main()
{
    short bPr,pPr,n, bVal, pVal, bCt=0, pCt=0;
    scanf("%hi %hi\n%hi\n", &bPr, &pPr, &n);
    
    while(n-->0){
        scanf("%hi %hi\n", &bVal, &pVal);
        bCt+=bVal;
        pCt+=pVal;
    }
    
    int v1 = bCt*bPr + pCt*pPr;
    int v2 = bCt*pPr + pCt*bPr;
    
    printf("%d ", v1 < v2 ? v1 : v2);
}