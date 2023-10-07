def is2Fac(n):
    while n>1:
        if n%2==1:
            return False
        n/=2
    return True

n=int(input())
res=0
for i in range(1, n+1):
    res += -1*i if is2Fac(i) else i
print(res)