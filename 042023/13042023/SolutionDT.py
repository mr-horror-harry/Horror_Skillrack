x=int(input())
ar = input().split()
res=0
for i in ar:
    mx=0
    for j in i:
        if int(j) > mx:
            mx=int(j)
    res+=mx
print(res)