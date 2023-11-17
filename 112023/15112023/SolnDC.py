h,m=map(int, input().split(":"))
m_val=int(input())

m_val+=m

cry=m_val//60
rem=m_val%60

h+=cry
m=rem

print(str(h%24).zfill(2), str(m).zfill(2), sep=":" )
