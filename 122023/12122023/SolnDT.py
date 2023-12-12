li=list(input())
st=set(li)
dc={}
for i in st:
    dc[i]=li.count(i)
tpls_li=sorted(dc.items(), key=lambda i: (-i[1], i[0]))
for entry in tpls_li:
    print(entry[0], end="")