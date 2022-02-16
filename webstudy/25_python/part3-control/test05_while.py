index = 1

++index  # ++ 연산자 없음,  ++index = +(+index) 의 개념임, 코드의 가독성을 위해 지원하지 않는다.
print("index : ", index)  # index :  1

# 1을 증가하기..
index += 1
print(index)

while index <= 9:
    index += 1
    print(index)

prompt = """
1. 등록
2. 삭제
3. 목록
4. 종료
메뉴 선택 :"""
number = 0
while number != 4:
    print(prompt)
    number = int(input())