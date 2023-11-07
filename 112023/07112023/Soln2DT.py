#using in operator
def isCons(c) -> bool:
    return not(c=='a' or c=='e' or c=='i' or c=='o' or c=='u')

s=input()
c='b'
f=True
while c<='z':
    if isCons(c):
        if c not in s:
            f=False
            print("NO")
            break
    c=chr(ord(c)+1)
if f:
    print("YES")