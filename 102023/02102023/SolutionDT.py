n = int(input())
li =list( map(int, input().split()) )
x = input()
tot = 0

while n>0:
    if str(li[n-1])[0] == x:
        tot+=li[n-1]
    n-=1

print(tot)