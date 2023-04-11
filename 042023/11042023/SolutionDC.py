x,n = input().split()
n=int(n)

res=""
while n>0 and x<='z':
    res = x + res
    x = chr( ord(x)+1 )
    n-=1
print(res)