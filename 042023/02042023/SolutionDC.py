x = int(input())
li = input().split()

lrg = int(max(li))

for i in li:
    print(lrg - int(i), end=" ")