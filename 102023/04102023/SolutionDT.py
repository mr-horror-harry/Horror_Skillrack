s=input()

print("01 02 03 04 05 06 07\n08 09 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28")

if(s!='FEB'):
    if(s=='APR' or s=='JUN' or s=='SEP' or s=='NOV'):
        print("29 30 -- -- -- -- --")
    else:
        print("29 30 31 -- -- -- --")