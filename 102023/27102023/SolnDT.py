def isVowel(c):
    c = c.lower()
    return c=='a' or c=='e' or c=='i' or c=='o' or c=='u'

s = input()
f=0
for c in s:
    if isVowel(c):
        if f==0:
            f=1
            print("{",c, sep="", end="")
        else:
            print(c, end="")
    else:
        if f==1:
            f=0
            print("}",c, sep="", end="")
        else:
            print(c, end="")
            
if f==1:
    print("}")