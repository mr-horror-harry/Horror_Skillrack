li=list(map(int,input().split()))

mx=0
for i in range(len(li)-1):
    if li[i] + li[i+1] > mx:
        mx=li[i]+li[i+1]
print(mx)