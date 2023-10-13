n=int(input())
li=list(map(int, input().split()))
st=set()

i=1
while i**2 <= n:
    if n%i==0:
        if i not in li:
            st.add(i)
        if n/i not in li:
            st.add(n//i)
    i+=1
li=list(st)
li.sort()
print(*li)