maxSum=0
n=int(input())
ctr=0
li=list(map(int, input().split()))

while ctr < n:
    x,y=li[ctr], li[ctr+1]
    if x+y > maxSum:
        maxSum=x+y
    ctr+=2
    
print(maxSum)