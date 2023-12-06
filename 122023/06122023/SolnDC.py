x,y=map(int, input().split())
c1,c2=1,y
while c1<=x or c2>=1:
    if c1<=x:
        print(c1, end=" ")
        c1+=1
    if c2>=1:
        print(c2, end=" ")
        c2-=1