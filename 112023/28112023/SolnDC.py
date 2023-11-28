x,y=map(int, input().split())
mat=[]
for i in range(x):
    mat.append(list(map(int, input().split())))
res=0
hx, hy=x//2, y//2
for i in range(hx, x):
    for j in range(hy, y):
        res+=mat[i][j]
print(res)