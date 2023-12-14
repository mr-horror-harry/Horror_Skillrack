s=input()
u, res=s[-1], ""
for i in s:
    if i!=u:
        res+=i
print(int(res) if res!="" else -1)