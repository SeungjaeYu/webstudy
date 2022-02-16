val = int(input())
arr = list()
for i in range(val):
    result = 0
    # for j in range(10):
    val2 = str(input()).split()
    if int(val2) % 2 != 0:
        result += int(val2)
    arr.append(result)


for k in arr[0:]:
    print(k)
    print()