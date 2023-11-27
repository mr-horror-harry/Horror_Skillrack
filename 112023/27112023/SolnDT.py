x,y=input().split()

x=list(x)
y=list(y)

c=len(y)-1
while c>=0:
    if y[c]!='0':
        break
    c-=1

tmp=x[0]
x[0]=y[c]
y[c]=tmp

print(int("".join(x)) + int("".join(y)))
