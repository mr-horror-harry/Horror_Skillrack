s,f=input(),True
for i in range(len(s)-2):
    tmp=s[i:i+3]
    if tmp==tmp[::-1]:
        print(tmp)
        f=False
if f:
    print(-1)