x = int(input())
val, ct = 1, 1

for i in range(x-1,-1,-1):
    print("*"*i,end="")
    for j in range(ct):
        print(val,end="")
        val+=1;
    ct+=1
    print()
    