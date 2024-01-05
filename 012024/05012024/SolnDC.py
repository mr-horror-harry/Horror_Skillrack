n=int(input())
mt=[[0] * n for i in range(n)]
val=n

for j in range(n):
    for i in range(n):
        if j%2==0:
            mt[i][j] = val
        else:
            mt[n-i-1][j] = val
        val+=n
        
for i in range(n):
    print(* mt[i])