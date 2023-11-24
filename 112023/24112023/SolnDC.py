n=int(input())
res=0
li=input().split()
for i in li:
    if len(i)%2==1:
        res+=int(i)   
print(res)