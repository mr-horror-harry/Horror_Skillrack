x,i,res = int(input()),0,300000
li=list(map(int, input().split()))
while i<x:
    tmp=li[i] + li[i+1] + li[i+2]
    if tmp<res:
        res=tmp
    i+=3
print(res)