u=input()
p=input()
F=True

for c in p:
    if c in u:
        print("INVALID")
        f=False
        break
    
if f:
    print("VALID")