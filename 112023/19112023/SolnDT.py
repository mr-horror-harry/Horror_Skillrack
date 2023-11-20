m,n = map(int, input().split())
ct=0
for i in range(m):
    li=input().split()
    f=True
    for j in range(1, n):
        if li[j-1] > li[j]:
            f=False
            break
    if f:
        ct+=1
print(ct)   