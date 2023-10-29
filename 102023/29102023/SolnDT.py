x,y=map(int, input().split())
val=0

while x>0 and y>0:
    val*=10
    val+=x%10
    val*=10
    val+=y%10
    
    x//=10
    y//=10

while x>0:
    val*=10
    val+=x%10
    x//=10
while y>0:
    val*=10
    val+=y%10
    y//=10
    
print(val)