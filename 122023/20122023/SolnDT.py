li=list(input())
e_li, p=list(filter(lambda x:int(x)%2==0, li)), 1

for i,x in enumerate(li):
    if int(x)%2==0:
        li[i]=e_li[p%len(e_li)]
        p+=1
print(int("".join(li)))