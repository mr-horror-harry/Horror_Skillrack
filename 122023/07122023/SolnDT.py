m,n=map(int, input().split())
ct=0
for i in range(m):
    li=list(map(int, input().split()))
    if li==sorted(li):
        ct+=1
print(ct)