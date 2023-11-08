n=int(input())
li=input().split()
res=""

for i in li:
    res+=bin(int(i))[-2:]
print(int(res, 2))