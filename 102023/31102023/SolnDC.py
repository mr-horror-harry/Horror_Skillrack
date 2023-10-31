n=int(input())
tmp=n
res=0
while tmp!=0:
    res+=tmp%10
    tmp//=10
print("YES" if n%res==0 else "NO")