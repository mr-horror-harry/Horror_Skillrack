s=input()
l=len(s)
i=0

print(s)
while i<l:
    print(s[:l-i-1], "*"*(i+1), sep="")
    print("*"*(i+1), s[i+1:], sep="")
    i+=1