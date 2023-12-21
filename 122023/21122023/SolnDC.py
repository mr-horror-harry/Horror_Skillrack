x,y=map(int, input().split())
while x<y:
    print(x%10, y%10, sep="", end="")
    x//=10
    y//=10