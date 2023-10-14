n=int(input())
ar=input().split()

mx=0
for i in ar:
    if len(i)>mx:
        mx=len(i)
        
p=0
while p<mx:
    for s in ar:
        if p>=len(s):
            print("*", end="")
        else:
            print(s[p],end="")
    print()
    p+=1
