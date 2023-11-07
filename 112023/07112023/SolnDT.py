#without in operator
def isVow(c) -> bool:
    return c=='a' or c=='e' or c=='i' or c=='o' or c=='u'

s=input()
li=[0 for i in range(26)]
f=True
#97 to 122
for i in s:
    li[ord(i)-97]+=1
    
for i,c in enumerate(li):
    if c==0:
        if not isVow(chr(i+97)):
            print("NO")
            f=False
            break
if f:
    print("YES")