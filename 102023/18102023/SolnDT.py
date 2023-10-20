s=input()
vow='aeiouAEIOU'
f=""
pos=""

for i in range(len(s)-1, -1, -1):
	if s[i] in vow:
		if f!="":
			s[pos]=s[i]
			pos=i
		else:
			f=s[i]
			pos=i

for c in s:
	print(c, end="")

