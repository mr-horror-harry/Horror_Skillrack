n=int(input())
bct=2**(n-1)
ct=1

while n>0:
    s="("*bct + ")"*bct
    
    for i in range(ct):
        print(s, end="")
    print()
    
    bct//=2; ct*=2; n-=1