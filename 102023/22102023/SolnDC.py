n,x=map(int, input().split())
n-=n%x

while n>0:
    print(n, end=" ")
    n-=x