/**
 *  콜백함수 사용하기
 *  - 매개변수 넘기기
 */
function func(cb) {
    console.log(typeof(cb));
    cb();
}

function myCall() {
    console.log("myCall 호출됨");
}


// func(myCall());     //  함수의 실행결과가 넘어간다.(undefined)
// func(myCall);
func(function () {
    console.log("myCall 호출됨");
});       

