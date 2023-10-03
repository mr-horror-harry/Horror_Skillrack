s=input()
l=len(s)
res=int( s[:l-1] )

tmp=int( s[:l-2] + s[l-1:] )
if tmp>res:
    res=tmp
tmp=int( s[:l-3] + s[l-2:] )
if tmp>res:
    res=tmp
    
print(res)