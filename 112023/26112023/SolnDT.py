n=int(input())
mat=[]
for i in range(n):
    mat.append(input().split())
    
def printRes(i, j, ct) -> None:
    while ct>0:
        print(mat[i][j], end=" ")
        i+=1; j-=1; ct-=1
    print()

ct=1
for j in range(n):
    printRes(0, j, ct)
    ct+=1

ct-=1

for i in range(1, n):
    ct-=1
    printRes(i, n-1, ct)
