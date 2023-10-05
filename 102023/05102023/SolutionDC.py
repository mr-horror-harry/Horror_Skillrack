def minVal(x, y, z):
    res = x
    if y<res:
        res=y
    if z<res:
        res=z
    return res

def gcd(x, y, z,  m):
    while(m>=1):
        if x%m==0 and y%m==0 and z%m==0:
            break
        m-=1
    return m

x,y,z = map(int, input().split())

m = minVal(x,y,z)
print(gcd(x,y,z, m))