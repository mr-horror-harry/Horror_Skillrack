n=int(input())
p,c = 1, n//2
for i in range(1+n//2):
    s=input().split()
    print("* "*c, end="")
    print(*s[len(s)-p : ])
    p+=1; c-=1
p-=1; c+=1
for i in range(n//2):
    p-=1; c+=1
    s=input().split()
    print("* "*c, end="")
    print(*s[len(s)-p : ])