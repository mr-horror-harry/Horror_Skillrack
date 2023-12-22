def isVow(c):
    return c=='a' or c=='e' or c=='i' or c=='o' or c=='u'
    
def isCon(c):
    if c>='a' and c<='z':
        return not(c=='a' or c=='e' or c=='i' or c=='o' or c=='u')
    return False

li=list(input())
l=len(li)
v=c=1
for i in range(l):
    if isCon(li[i]):
        li[i]=str(c)
        c+=1
    if isVow(li[l-i-1]):
        li[l-i-1]=str(v)
        v+=1
print("".join(li))