x,y=map(int, input().split())
ct=abs(x-y)
res=0

res+=(ct//5)
ct%=5

res+=(ct//2)
ct%=2

res+=ct
print(res)