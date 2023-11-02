n = int(input())
u = n%10

while(n>9):
    n//=10
    
val = n*10
val+=u
print(val*val)