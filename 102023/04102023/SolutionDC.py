s = input()

for c in s:
    print( c if c.isdigit() else ord(c), end=" ")