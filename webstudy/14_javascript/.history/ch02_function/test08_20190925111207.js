/**
 *  글로벌 변수와 로컬 변수
 * 
 *  - 글로벌 변수 : 함수 밖에 선언, 전역에서 사용
 *  - 로컬 변수 : 함수 안에 선언, 함수 안에서만 사용 가능, 함수종료시 메모리 제거
 */
let msg = "글로벌 변수";
console.log("msg : ", msg);

function func() {
    let msg = "로컬 변수";
    console.log("msg : ", msg);
}
func

