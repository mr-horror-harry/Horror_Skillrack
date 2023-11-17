x,y,z=map(int, input().split())

n=1
while True:
    if n not in range(x,y+1):
        if n%z==0:
            print(n)
            break
    n+=1