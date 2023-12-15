s=input()
x,y=input().split()
a,b="a","b"

if len(y)>len(x):
    x,y=y,x
    a,b="b","a"

while len(s)>1:
    if(x==s[:len(x)]):
        print(a, end="")
        s=s[len(x):]
    else:
        print(b, end="")
        s=s[len(y):]
