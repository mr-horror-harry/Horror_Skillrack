n=int(input())
l1=list(map(int, input().split()))
l2=list(map(int, input().split()))

for i in range(n):
    if l1[i]%2==1:
        print(l1[i], end=" ")
    if l2[i]%2==1:
        print(l2[i], end=" ")