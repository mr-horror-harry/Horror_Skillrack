s = input()

for i in range(len(s)):
    print(ord(s[i]) if(i%2==0) else s[i], end="")