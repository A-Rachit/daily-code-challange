def kthsmall(arr,k):
    arr.sort()
    v=arr[k-1]
    print(k,"th smallest value in the array is ",v)

arr=[2,4,5,7,-5,-90,64,4,3]
kthsmall(arr,4)
