#include<stdio.h>
#include<stdlib.h>

int main()
{
    short n, i, j;
    scanf("%hi\n", &n);
    
    int ar[n];
    for(i=0; i<n; i++)
        scanf("%d ", &ar[i]);
        
    int x,y;
    scanf("\n%d %d", &x, &y);
    
    i=0;
    while(1)
        if(ar[i++]%x==0)
            break;
    
    j=n-1;
    while(1)
        if(ar[j--]%y==0)
            break;
    
    i--; j++;
    int tmp = ar[i];
    ar[i] = ar[j];
    ar[j] = tmp;
    
    for(i=0; i<n; i++)
        printf("%d ", ar[i]);

}