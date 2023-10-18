def isEven(x,y,z):
    return not (x%2==1 or y%2==1 or z%2==1)

x,y,z=map(int, input().split())
print(x+y+z if isEven(x,y,z) else x*y*z)