s = input()
j=len(s)-1

for i in s:
    if(int(s[j])==0): print("-")
    else: print(i* int(s[j]))
    j-=1