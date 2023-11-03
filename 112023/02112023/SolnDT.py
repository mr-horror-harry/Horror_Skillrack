n=int(input())

i=1
while i<=n:
    if i%15==0:
        print("SkillRack")
    elif i%5==0:
        print("Rack")
    elif i%3==0:
        print("Skill")
    else:
        print(i)
    i+=1