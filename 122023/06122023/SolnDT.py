n=int(input())
rCt=pow(2,n-1)
cCt=1
h,t=1,n-1
print(str(n)*rCt)
for i in range(n-1):
    rCt//=2
    for j in range(cCt):
        print(str(t)*rCt, str(h)*rCt, end="", sep="")
    print()
    cCt*=2
    h+=1
    t-=1