def binary(n) -> str:
    res=""
    while n>0:
        res+=str(n%2)
        n//=2
    return res[::-1]

n = int(input())
b = binary(n)
i=0
try:
    while i<len(b):
        while b[i]=='1':
            print(1, end="")
            i+=1
        else:
            print()
            
        while b[i]=='0':
            print(0,end="")
            i+=1
        else:
            print()
except:
    pass