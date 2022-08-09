def sort012(arr):
    arr0=[]
    arr1=[]
    arr2=[]
    for i in range(len(arr)):
        if(arr[i]==0):
            arr0.append(arr[i])
        if(arr[i]==1):
            arr1.append(arr[i])
        if(arr[i]==2):
            arr2.append(arr[i])
    sarr=arr0+arr1+arr2
    return sarr 

arr=[0,1,2,0,2,1,2,1,2,0,1,2,0,1,0,2,1,2,0,1,0]
sarr=sort012(arr)
print("sorted array")
for i in range(len(sarr)):
    print(sarr[i])

