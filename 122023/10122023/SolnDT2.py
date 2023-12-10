#using filter --> more time complexity
def filter_sum(li, i) -> int:
    tli=filter(lambda x:x%10==i, li)
    return sum(tli)

n=int(input())
li=list(map(int, input().split()))
res=0
for i in range(10):
    sum_val=filter_sum(li, i)
    if sum_val>res:
        res=sum_val
print(res)