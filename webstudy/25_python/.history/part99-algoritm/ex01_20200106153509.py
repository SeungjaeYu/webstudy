val = int(input())
arr = list()
for i in range(val):
    result = 0
    val2 = str(input()).split()
    for j in val2:
        if int(j) % 2 != 0:
            result += int(j)
    arr.append(result)

idx = 0
for k in arr[0:]:
    idx += 1
    print("#{0} ",idx," ",k)