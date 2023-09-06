x = bin( int(input()) )[2:].split("10")
l=len(x)

for i in range(l):
    if x[i]!='':
        if i!=l-1:
            print("NO")
            exit(0)
        else:
            if(len(x[i])>1):
                print("NO")
                exit(0)
            
print("YES")