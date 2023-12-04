x,y,z=map(int, input().split())
li=list(map(int, input().split()))
res=0
for i in li:
    res+=i
    if i>y:
        res+=z
print(res)