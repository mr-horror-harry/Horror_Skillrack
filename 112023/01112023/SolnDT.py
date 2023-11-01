def max_Li(*args):
    res=0
    for i in args:
        if i>res:
            res=i
    return res

x,y,z = input().split()
print( max_Li(int(x+y), int(y+x), int(x+z), int(z+x), int(y+z), int(z+y)))