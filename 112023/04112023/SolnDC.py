x = int(input())
res=0

while x>0:
    res+=x%1000
    x//=1000
print(res)