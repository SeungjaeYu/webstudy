val = int(input())
arr = list()
for i in range(val):
    result = 0
    # for j in range(10):
    val2 = str(input()).split()
    for j in val2:
        if int(j) % 2 != 0:
            result += int(j)
    arr.append(result)


for k in arr[0:]:
    print(k)
    print()