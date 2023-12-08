n=input()
li=list(input())
ct=0
for i in n:
    if i in li:
        ct+=1
        li.remove(i)
print(ct)