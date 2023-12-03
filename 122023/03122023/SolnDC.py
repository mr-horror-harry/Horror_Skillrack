s=input()
i=0
res=int(s)
while i<len(s):
    x=int(s[i:]+s[:i])
    if x>res:
        res=x
    i+=1
print(res)