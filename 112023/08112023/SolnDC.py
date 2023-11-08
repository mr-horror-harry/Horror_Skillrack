def isVow(c) -> bool:
    c=c.lower()
    return c=='a' or c=='e' or c=='i' or c=='o' or c=='u'

s=input()
stat=""
for i in s:
    if isVow(i):
        stat = 's' if (i>='a' and i<='z')  else 'c'
        break
    
f=True
for i in s:
    if isVow(i):
        if (stat=='s' and i>='A' and i<='Z') or (stat=='c' and i>='a' and i<='z'):
            print('NO')
            f=False
            break
if f:
    print("YES")