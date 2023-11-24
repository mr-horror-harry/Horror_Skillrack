s=input()
i=0
f=r=len(s)//2
t,l=len(s),len(s)//2

for i in range(l):
    li=list("*"*t)
    li[f]=li[r]=s[i]
    f-=1; r+=1; i+=1
    print(*li, sep="")
print(s[i:], s[t-2:i-1:-1], sep="")