def isRep(x) -> bool:
    for i in x:
        if i!=x[0]:
            return False
    return True

n=int(input())
li=input().split()
f=True

for x in li:
    if isRep(x):
        f=False
        print(x, end=" ")
        
if f:
    print(-1)
