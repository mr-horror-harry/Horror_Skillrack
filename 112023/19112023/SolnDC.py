s=input()
l, res=len(s), 0
for i in range(0, l, 3):
    res+=int(s[i:i+3])
print(res)