def pow_2(n):
    res=1
    while n>0:
        res*=2
        n-=1
    return res

def binary(o, n):
    res=0
    while o>0:
        n-=1
        res+=pow_2(n)
        o-=1
    return res

n=int(input())
o=0
li=input().split()
for i in li:
    if i=='1':
        o+=1

print( binary(o, n) )