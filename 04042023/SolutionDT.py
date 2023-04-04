x = input()
ar = input().split()
odd, eve = 9999999, 2;

for i in ar:
    val = int(i)
    if val%2==0 and val>eve:
        eve = val;
    elif val%2==1 and val<odd:
        odd = val;

for i in range(min(odd, eve), max(odd, eve)+1):
    print(i,end=" ");