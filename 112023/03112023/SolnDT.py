s=input()
i=0
#for 1st char
if s[i]=='.':
    print(0, end="")
    i+=1
try:
    #for rem n-1 chars
    while i<len(s):
        if s[i]=='-':
            if s[i+1]=='-':
                print(2, end="")
            else:
                print(1, end="")
            i+=2
        else:
            print(0,end="")
            i+=1
except:
    try:
        #for last char
        if s[i]=='.':
            print(0)
    except:
        pass