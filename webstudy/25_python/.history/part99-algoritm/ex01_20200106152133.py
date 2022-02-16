val = int(input())
arr = list()
for i in range(val):
    result = 0
    val2 = int(input())
    for j in range(val2):
        if j % 2 != 0:
            result += j
    list.append(result)


for k in list[0:]:
    print(k)
    