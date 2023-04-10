#include<stdio.h>
#include<stdlib.h>

int main()
{
    char s[101];
    scanf("%s ", &s);
    
    int res=0;
    for(int i=0; i<strlen(s); i++){
        s[i]>='a' && s[i]<='m' ? res++ : res--;
    }
    
    printf(res==0 ? "-1" : res>0 ? "FIRSTHALF" : "SECONDHALF");
    return 0;
}