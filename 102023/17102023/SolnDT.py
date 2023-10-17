n=int(input())
li=input().split()
f=True

for i in range(n-2):
    if li[i]=='1' and li[i+1]=='2' and li[i+2]=='3':
        f=False
        print("YES")
        break
    
if f:
    print("NO")