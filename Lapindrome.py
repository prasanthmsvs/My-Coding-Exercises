import collections
t = int(input()) 
for i in range(t):
    s=input()
    if(len(s)%2==0):
        x=int(len(s)//2)
        s1=list(s[0:x])
        s2=list(s[x:])
    else:
        x=int(len(s)//2)
        s1=list(s[0:x])
        s2=list(s[x+1:])
    if((len(s1)==len(s2)) and (collections.Counter(s1)==collections.Counter(s2))):
        print("YES")
    else:
        print("NO")
