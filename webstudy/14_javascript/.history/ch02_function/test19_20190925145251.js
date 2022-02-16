/**
 *  화살표 함수
 *  - 실행문장과 리턴
 */
let func1 = function (num) {
    return num * num;
}
console.log(func1(3));

// 화살표 함수 변경
func1 = num => { return num * num };
console.log(func1(3));

// return 문을 생략 할 수 있다.
func1 = num => {num * num;};
console.log(func1(3));  // undefined

func1 = num => num * num;
console.log(func1(3));