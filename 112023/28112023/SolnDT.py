m,n=map(int, input().split())

mat=[]
for i in range(m):
    mat.append(input().split())

for j in range(n):
    for i in range(m):
        if mat[i][j] in 'aeiouAEIOU':
            print(mat[i][j], end="")
            break