#Solution with index pointing methodology

s1=input()
s2=input()
f=False
ct=1
l=len(s1)-1
while ct<=len(s1):
    tct=ct
    b=0
    while tct>0:
        if s1[b:b+l]==s2[b:b+l]:
            print(s1[b:b+l])
            f=True
            break
        b+=1
        tct-=1
    if f:
        break
    l-=1
    ct+=1