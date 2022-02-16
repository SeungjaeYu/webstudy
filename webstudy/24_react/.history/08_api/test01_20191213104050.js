/**
 *  Promise(ES6)
 * 
 *  비동기 작업에 사용됨(콜백함수 처리를 위한..)
 * 
 */
// 
let p = new Promise((resolve, reject) => {
    console.log("promise 실행");
    // 처리 완료시 해야할일
    resolve
});

p.then(() => {
    console.log("then");
});