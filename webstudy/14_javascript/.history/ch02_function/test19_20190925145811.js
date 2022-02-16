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

// func1 = num => return num * num;  블럭없이 return 사용시 에러
// console.log(func1(3));   //

func1 = num => console.log(num * num);  // return 할 수 없는 형태라면 undefined가 리턴된다.
console.log(func1(3));  // 9, undefined

// 실행문장이 여러 문장인 경우 {}으로 묶어준다.
func1 = (num) => {
    console.log(num);
    return num;
};
console.log()
