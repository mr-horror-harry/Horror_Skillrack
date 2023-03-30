s=input()
res=0

for c in s:
    res += 1 if c>='a' and c<='m' else -1
    
print(-1 if res==0 else "FIRSTHALF" if res>0 else "SECONDHALF")