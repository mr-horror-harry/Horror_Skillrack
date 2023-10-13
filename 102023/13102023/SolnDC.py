s=input()
l,u=False,False
f=s[0].isupper()

if len(s)==1:
    print('VALID')
else:
    if s[1:].isupper():
        u=True
    elif s[1:].islower():
        l=True
    
    if (f and u and not l) or (not f and l and not u) or (f and l and not u):
        print('VALID')
    else:
        print('INVALID')