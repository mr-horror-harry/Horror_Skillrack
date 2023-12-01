n=list(bin(int(input()))[2:])
x=int(input())

while x>0:
    try:
        n.remove('0')
        x-=1
    except:
        break
    
print(int("".join(n), 2))