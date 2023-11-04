def maxDigSum(li) -> int:
    res=0
    for i in li:
        mx=0
        while i>0:
            if i%10 > mx:
                mx=i%10
            i//=10
        res+=mx
    return res

n=int(input())
li=list(map(int, input().split()))
res = maxDigSum(li)
print(res)