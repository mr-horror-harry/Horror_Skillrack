ar = input().split()
ct=0

for s in ar:
    f=0
    for c in s:
        if not(c>='a' and c<='z'):
            f=1;
            break;
    ct += 1 if f==0 else 0
print(ct)