n=int(input())
s=2
while(n>0):
    n-=1
    print("-"*n + "*"*s + "-"*n)
    s+=2