#include<stdio.h>
#include<stdlib.h>

int main()
{
    char date[11];
    scanf("%s", date);
    
    int i=0;
    int yr=0, mon=0, day=0;
    while(date[i]!='-'){
        yr=yr*10 + (date[i++]-'0');
    }
    i++;
    while(date[i]!='-'){
        mon=mon*10 + (date[i++]-'0');
    }
    i++;
    while(date[i]!='\0'){
        day=day*10 + (date[i++]-'0');
    }
    
    int ar[13] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
    
    int res = ar[mon-1] + day, f=0;
    
    if(yr%400==0){
        f=1;
    }
    else{
        if(yr%4==0 && yr%100!=0){
            f=1;
        }
    }
    
    if(f==1){
        if(mon>2){
            res++;
        }
    }
    printf("%d", res);
}