li=list(bin(int(input()))[2:])
for i in range(len(li)-1, -1, -1):
    if li[i]=='1':
        li[i]='0'
        break
print(int("".join(li), 2))