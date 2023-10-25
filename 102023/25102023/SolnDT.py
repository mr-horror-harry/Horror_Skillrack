s = input()
l = s[-2]+s[-1]
ct=0

for i in range(len(s)-1):
    if s[i]+s[i+1] == l:
        ct+=1

print(ct)