s=input()
i=0

while i<len(s):
    print(s[i]*i, s[i:], sep="")
    i+=1