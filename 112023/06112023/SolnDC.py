def getPow(x, y):
    powerVal=1
    while y>0:
        powerVal*=x
        y-=1
    return powerVal
    
n=int(input())
tmp=n
numOfDig=0
while tmp>0:
    numOfDig+=1
    tmp//=10
    
tenPowVal=getPow(10, numOfDig//2)
print("YES" if n//tenPowVal==n%tenPowVal else "NO")