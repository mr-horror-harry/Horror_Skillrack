#include<stdio.h>
#include<stdlib.h>
#define pi 22*(1.0)/7

double dist(char x1, char y1, char x2, char y2){
    return sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
}

int main()
{
    char x1, y1, x2, y2;
    scanf("%hhi %hhi %hhi %hhi", &x1, &y1, &x2, &y2);
    
    double r = dist(x1, y1, x2, y2);
    
    printf("%.2f", pi*r*r);
}