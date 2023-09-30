m,n=map(int, input().split())
f=True
mat=[]

for i in range(m):
    mat.append( list(map(int, input().split())) )
    
for i in range(m):
    if mat[i][0]%2!=0 or mat[i][n-1]%2!=0:
        f=False
        print("NO")
        break

if f:
    for j in range(n):
        if mat[0][j]%2!=0 or mat[m-1][j]%2!=0:
            f=False
            print("NO")
            break
if f:
    print("YES")