s="AEIOUaeiou"
x=input()
f=0

for i in x:
    if not(i in s):
        f=1
        print("NO")
        break

if f!=1:
    print("YES")
        