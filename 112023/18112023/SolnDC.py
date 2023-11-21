n, x=int(input()), 0
while n>0:
    print(chr(97 + x%4), end="")
    x+=1
    n-=1