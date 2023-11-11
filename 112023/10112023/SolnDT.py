n=int(input())
li=list(map(int, input().split()))
f=True
pos=0

for i in range(len(li)):
    if li[i]%2==1:
        if f:
            pos=i
            f=False
        else:
            li[i], li[pos] = li[pos], li[i]
            f=True
            
print(*li)