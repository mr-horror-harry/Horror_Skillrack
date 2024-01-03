s=input().split()
n=int(input())

for i,s in enumerate(s):
    print(s[::-1] if (i+1)%n==0 else s, end=" ")