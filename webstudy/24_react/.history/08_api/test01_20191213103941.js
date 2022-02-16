/**
 *  Promise(ES6)
 * 
 *  비동기 작업에 사용됨(콜백함수 처리를 위한..)
 * 
 */
// 
let p = new Promise((req) => {
    console.log("promise 실행");
});

p.then(() => {
    console.log("then");
});