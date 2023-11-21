def getNoBin1(n) -> int:
    ct=0
    while n>0:
        ct += n%2
        n//=2
    return ct

x,y=map(int, input().split())
print( getNoBin1(x^y) )