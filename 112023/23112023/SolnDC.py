s=input()
f,r=0,len(s)

while f<r:
    print("*"*f,s[f:r],"*"*f, sep="")
    f+=1; r-=1

f-=1; r+=1

while f>0:
    f-=1; r+=1
    print("*"*f,s[f:r],"*"*f, sep="")