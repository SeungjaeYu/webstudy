T = int(input())
arr = list()
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    result = 0
    val2 = str(input()).split()
    # for j in val2:
    if val2[0] > val2[1]:
        result += int(j)
    result = round(result / len(val2))    
    arr.append(result)

idx = 0
for k in arr[0:]:
    idx += 1
    print("#{0} {1}".format(idx,k))