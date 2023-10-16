n=int(input())
i,j=1,n
ct=0

while i<=j:
    ti,tj=i,j
    s=""
    st="* "*ct
    while ti<tj:
        s+=str(ti)+" "+str(tj)+" "
        ti+=1
        tj-=1
    if ti==tj:
        s+=(str(tj)+" ")*2
    while ti>i:
        ti-=1
        tj+=1
        s+=str(tj)+" "+str(ti)+" "
    s=s.strip()
    print(st + s + st[::-1])
    j-=1
    ct+=1