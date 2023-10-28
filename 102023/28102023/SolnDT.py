def is2Odd(n):
    ct=0
    while n>0:
        if (n%10)%2==1:
            ct+=1
        if ct==2:
            break
        n//=10
    return ct==2

n = int(input())
li = list(map(int, input().split()))
res=0
for i in li:
    if is2Odd(i):
        res+=i
print(res)