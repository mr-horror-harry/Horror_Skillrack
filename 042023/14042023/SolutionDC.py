s=input().strip()
l, i = len(s), 1

while(i<=l):
    if not(l%i):
        print(s[i-1],end="")
    i+=1