def isbal(n) -> int:
    val=0
    while n>0:
        if n%10%2==0:
            val+=n%10
        else:
            val-=n%10
        n//=10
    return val

n=int(input())
i=1
while i<=n:
    if isbal(i)==0:
        print(i, end=" ")
    i+=1