/**
 *  sum 함수 구현하기
 *  1. arr이 없을 경우 0을 반환
 *  2. start 없을 경우 0을 할당해서 계산
 *  
 * 
 */
let sum = function (arr, start, end) {

}

let arr = [1, 2, '홍', 4, 5];
console.log( sum(arr, 0, arr.length) );    // 12
console.log( sum(arr, 0, 4) );             // 7
console.log( sum(arr, 0) );                // 12
console.log( sum(arr, 0) );                // 12
console.log( sum(arr, 2) );                // 9
console.log( sum(arr) );                   // 12
console.log( sum() );                      // 0