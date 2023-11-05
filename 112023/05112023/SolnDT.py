s=input()
mn=int(s)
i=len(s)-3
while i<len(s):
    x=int(s[:i] + s[i+1:])
    if x<mn:
        mn=x
    i+=1
print(mn)