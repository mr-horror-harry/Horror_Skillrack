x=int(input())
slot=input().split()
ct=0

for i in range(0, x-1):
    if slot[i]=='0' and slot[i+1]=='0':
        ct+=1
print(ct)