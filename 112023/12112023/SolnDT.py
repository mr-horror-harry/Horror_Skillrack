s=input()
li=[]
l,p=len(s),0
hf=(l+1)//2
for i in range(hf):
    rw=""
    for j in range(l):
        if i==j or i+j==l-1:
            rw+=s[p]+" "
            p+=1
        else:
            rw+="* "
    print(rw)
    li.append(rw)
    
p = (l//2)-1
while p>=0:
    print(li[p])
    p-=1