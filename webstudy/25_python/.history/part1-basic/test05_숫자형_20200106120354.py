"""
수치형
0o : 8진수
0b : 2진수
0x : 16진수
"""
num = 10
print(10, 0o12, 0b1010, 0xa)

'''
oct(10)   - Oo12
bin(10)   - Ob1010
hex(10)   - Oxa
'''
print(oct(10), bin(10), hex(10))

# 3버전 부터 정수/정수 -> float로 나옴
print(100 / 3)   # 33.333333333333336

print(100 // 3)  # 33 -> 정수나누기

print(3 ** 2, 3 ** 3)  # 9 27, ** 거듭제곱

# 값만 쓰는데도 에러 발생하지 않는다... ^^
100
200
응 아니야