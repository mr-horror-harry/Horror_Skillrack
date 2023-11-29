n, i=int(input()), 1

while i<=n:
    print('* '*(n-i), end="")
    print(*range(i, 1, -1), *range(1, i+1), '* '*(n-i))
    i+=1
    
i-=1 
while i>1:
    i-=1
    print('* '*(n-i), end="")
    print(*range(i, 1, -1), *range(1, i+1), '* '*(n-i))