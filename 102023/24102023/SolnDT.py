n=int(input())
res=0
li = list(map(int, input().split()))

for x in li:
    u=x%10
    x//=100
    x = x*10 + u
    res+=x
print(res)