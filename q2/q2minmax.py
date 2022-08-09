def min(arr) :
    v=arr[0]
    for i in range(len(arr)):
        if v>arr[i]:
            v=arr[i]
    print("smallest value in the array is ",v)
def max(arr):
    v=arr[0]
    for i in range(len(arr)):
        if v<arr[i]:
            v=arr[i]
    print("biggest value in the array is ",v)
    
arr=[1,2,4,45,65,-9]
min(arr)
max(arr)