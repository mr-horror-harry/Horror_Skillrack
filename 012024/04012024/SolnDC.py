s=input().strip()
n=int(input())
print("yes" if s[:n]==s[-n:] else "no")