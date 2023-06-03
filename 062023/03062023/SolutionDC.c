#include<limits.h>

void removeIndices(int ar[], int m, int indices[], int n)
{
    for(int i=0; i<n; i++){
        ar[indices[i]]=INT_MIN;
    }
    
    int i, j;
    for(i=0; i<m; i++){
        
        if(ar[i]==INT_MIN){
            
            j=i+1;
            while(j<m && ar[j]==INT_MIN)
                j++;
            
            if(j==m) return;
            
            ar[i]=ar[j];
            ar[j]=INT_MIN;
        }
        
    }
    
}