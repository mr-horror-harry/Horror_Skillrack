n,x = map(int, input().split())
ar=input().split()

ar.sort(reverse=True)

res=0
for i in range(x):
    res+=int(ar[i])
print(res)