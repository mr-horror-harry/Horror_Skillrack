n,i=input(),0
try:
    while i<=len(n):
        print(int(n[i])*(n[:i]+n[i+1:]+" "))
        i+=1
except:
    pass