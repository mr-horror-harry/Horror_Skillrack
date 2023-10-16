int(input())

def sumDiv(n):
    x, res=n, 0
    while x>0:
        res+=x%10
        x//=10
    return n%res==0


li=list(map(int, input().split()))
f=True
for x in li:
    if sumDiv(x):
        print(x, end=" ")
        f=False
        
if f:
    print(-1)