s=input()
f=0
for i in range(0, len(s)-2):
    if s[i]==s[i+1] and s[i+1]==s[i+2]:
        print("invalid")
        f=1
        break
    
if f==0: print("valid")