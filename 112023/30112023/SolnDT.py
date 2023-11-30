li=list(input())

st1=set([c for c in li if li.count(c)%2==1])
s=""
for c in li:
    if c in st1:
        s+=c
        st1.remove(c)
        
print(s if s!="" else -1)