n, f=input(), True

for i in range(1, len(n)):
    if n[i-1] > n[i]:
        print("NO")
        f=False
        break
if f:
    print("YES")