s = input()
f=True

for i in range(len(s)):
    x = int(s[:i]+s[i+1:])
    if x%8==0 and x!=0:
        print("YES")
        f=False
        break
        
if f:
    print("NO")