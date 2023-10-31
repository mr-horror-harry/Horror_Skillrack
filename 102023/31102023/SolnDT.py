s=input()
i=0
try:
    while True:
        print(s[i+2] if s[i+1]==' ' else s[i], end="")
        i+=1
except:
    print(s[0])
    