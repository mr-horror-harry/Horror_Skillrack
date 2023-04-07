s=input()

res=0
for i in range(len(s)):
    res = res*10 + int(s[i+1]) if i%2==0 else res*10 + int(s[i-1])      # by ternary
print(res)