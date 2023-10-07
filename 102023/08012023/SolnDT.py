n=input()

if int(n)%100>=11 and int(n)%100<=20:
    print(n+"th")
else:
    if n[-1]=='1':
        print(n+"st")
    elif n[-1]=='2':
        print(n+"nd")
    elif n[-1]=='3':
        print(n+"rd")
    else:
        print(n+"th")