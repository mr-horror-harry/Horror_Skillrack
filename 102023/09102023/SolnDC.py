x,y,z=map(int, input().split())
ct=0
a,b,c=1,2,4

while a<=x and b<=y and c<=z:
    ct+=1
    a+=1; b+=2; c+=4
    
print(ct)