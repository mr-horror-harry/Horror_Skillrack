def binary(n):
    s=''
    while n>0:
        s+=str(n%2)
        n//=2
    return s[::-1]

def octal(n):
    dec=0
    l=len(n)-1
    for i in n:
        dec += int(i) * (8**l)
        l-=1
    return dec

n=input()
dec=octal(n)
print(binary(dec))