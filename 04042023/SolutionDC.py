n = int(input())
ar = input().split()
x = int(input())

f=0
for i in ar:
    if(int(i) < x):
        f=1
        break
print("yes" if f==0 else "no")