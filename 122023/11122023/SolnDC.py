n,x = input().split()
li = input().split()
res=0
for i in li:
    if i[-len(x):]==x:
        res+=int(i)
print(res)