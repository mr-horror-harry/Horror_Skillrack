m,n = map(int, input().split())

mt=[]

for i in range(m):
    row=[]
    ip=input().split()
    for elt in ip:
        row.append(int(elt))
    mt.append(row)
    
for i in range(m-1):
    for j in range(n-1):
        print(mt[i+1][j]+mt[i][j+1] , end=" ")
    print(mt[i+1][n-1])    
    
for j in range(n-1): print(mt[m-1][j+1], end=" ")
print(mt[m-1][n-1])