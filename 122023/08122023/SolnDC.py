s=input()
tg=input()
 
for i,c in enumerate(tg):
    if c in 'uU':
        print(s[i].upper(), end="")
    if c in 'lL':
        print(s[i].lower(), end="")