def sum10(x):
    x=str(x)
    res=0
    for i in x:
        res+=int(i)
    return True if res==10 else False
    
n=int(input())
val=19
while n>1:
    val+=1
    if sum10(val):
        n-=1
print(val)