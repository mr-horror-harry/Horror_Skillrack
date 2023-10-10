x,y,z = map(int, input().split())
m=max(x, max(y,z))
print(3*m - (x+y+z))