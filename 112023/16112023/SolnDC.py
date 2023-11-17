n,x=map(int, input().split())

li=[]
f = True if x>0 else False
for i in range(1,n+1):
    li.append(i)
    if f:
        if x>0:
            li.append(i)
            x-=1
    else:
        if x<0:
            if n-i+1==abs(x):
                li.append(i)
                x+=1    
print(*li)
        