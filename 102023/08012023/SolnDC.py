def isPrime(n):
    i=2
    while i**2<=n:
        if n%i==0:
            return False
        i+=1
    return True
        
x,y=map(int, input().split())
while x<=y:
    x+=1
    if isPrime(x):
        break
print("YES" if x==y else "NO")