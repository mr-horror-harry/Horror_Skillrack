n=int(input())
li=input().split()
l=len(li)

for i in range(l-1):
    li.append(li[i][-1] + li[i+1][0])
    li[i]=li[i][:-1]
    li[i+1]=li[i+1][1:]
    
li=list(map(int, li))

for i in range(l-1):
    print(li[i], "+", li[i+l], "+", end=" ")
print(li[l-1], "=", sum(li))