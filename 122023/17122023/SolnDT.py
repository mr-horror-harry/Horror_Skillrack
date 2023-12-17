n,c=input().split()
n=int(n)
d, i, li, ct = n-1, -1, [], n-2
s="-"*d + c

while ct>=0:
    print(s); 
    li.insert(0, s)
    d-=1; ct-=1; i+=1
    s="-"*d + c + "-"*i + c + "-"*i + c
    
print(c*(2*n-1))
print(*li, sep="\n")