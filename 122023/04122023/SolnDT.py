n=int(input())
li=input().split()
res=0
for i in li:
    i=list(i)
    try:
        i.remove('0')
    except:
        pass
    i="".join(i)
    res+=int(i)
print(res)    