n, x=map(int, input().split())
li=list(map(int, input().split()))
res = 100000001

for i in li:
    if i<res and len(str(i))==x:
        res=i
        
print(res if res!=100000001 else -1)