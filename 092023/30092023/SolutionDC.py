n=int(input())
i,p=0,2
s="abcdefghijklmnopqrstuvwxyz"

while i<n:
    if i%2==0:
        print(s[:p])
        p-=1
    else:
        print(s[:p])
        p+=3
    i+=1