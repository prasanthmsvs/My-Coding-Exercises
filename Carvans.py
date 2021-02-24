t=int(input())
for i in range(t):
    count=1
    n=input()
    l= [int(x) for x in input().split()]
    for k in range(len(l)-1):
        if(l[k]>l[k+1]):
            count+=1
print(count)
