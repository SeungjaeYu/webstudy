val = int(input())
arr = list()
for i in range(val):
    result = 0
    for j in range(10):
        val = int(input())
        if j % 2 != 0:
            result += j
    arr.append(result)


for k in arr[0:]:
    print(k)
    print()