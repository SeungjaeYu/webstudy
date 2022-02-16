val = int(input())
arr = list()
for i in range(val):
    result = 0
    val2 = int(input())
    for j in range(val2):
        if j % 2 != 0:
            result += j
    arr.append(result)


for i in arr[1:]:
    print(k)
    print()