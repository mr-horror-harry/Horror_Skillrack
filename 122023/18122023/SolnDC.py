x,y=map(int, input().split())
ct=x
while ct<=y:
    if not(ct%x==0 or ct%10==y%10):
        print(ct, end=" ")
    ct+=1