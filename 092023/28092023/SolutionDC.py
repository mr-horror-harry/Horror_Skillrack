s = input()

for i in range(len(s)):
    x = int(s[:i] + s[i+1:])
    print((s[i]+ " ")*x)