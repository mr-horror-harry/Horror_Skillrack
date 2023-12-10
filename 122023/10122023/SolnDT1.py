# lesser time complexity
n=int(input())
li=list(map(int, input().split()))
fin_res=0
while len(li)!=0:
    tli=li[:]
    u=tli[0]%10
    res=0
    for i in tli:
        if i%10==u:
            res+=i
            li.remove(i)
    if res>fin_res:
        fin_res=res
print(fin_res)