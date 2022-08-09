arr=[1,2,3,4,5,6,7,8]
rarr=[]
for i in range(len(arr)-1,-1,-1):
    rarr.append(arr[i])
    
for j in range(len(rarr)):
    print(rarr[j])
    