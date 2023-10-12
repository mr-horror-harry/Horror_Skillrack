x,y=map(int, input().split())
f=True
while x<=y:
    if str(x)==str(x)[::-1]:
        print(x, end=" ")
        f=False
    x+=1

if f:
    print(-1)