n=int(input())
f=n%2
while n%2==f:
    n//=10
print(n)