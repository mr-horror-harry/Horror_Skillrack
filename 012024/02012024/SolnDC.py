n=int(input())
li=list(map(int, input().split()))
x=int(input())
for i in range(len(li)-x+1):
    print(sum(li[i:i+x]), end=" ")