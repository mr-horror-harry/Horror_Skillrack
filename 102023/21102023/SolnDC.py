row=int(input())
pos=col=(row+1)//2
val=1

for i in range(row):
    for j in range(col):
        if j==0 or j==pos-1:
            print(val, end=" ")
        else:
            print("*", end=" ")
    print()
    val+=1
    pos += -1 if i<row//2 else +1
    