def pow_2(n):
    ct=0
    while n>1:
        ct+=1
        n/=2
    return ct

ct=pow_2( int(input()) )
print("2*"*(ct-1),2,sep="")