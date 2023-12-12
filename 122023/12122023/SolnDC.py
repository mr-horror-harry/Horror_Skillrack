def mulList(x) -> int:
    return x*2 if x%2==0 else x*4

n=int(input())
li=list(map(int, input().split()))

updated_list = map(mulList, li)
print(sum(updated_list))