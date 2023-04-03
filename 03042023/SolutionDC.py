n=int(input())
s=input().split()

print(*s[n-1::-1],*s[n:])
