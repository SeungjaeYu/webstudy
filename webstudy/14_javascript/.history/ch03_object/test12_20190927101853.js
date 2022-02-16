/** 
 *  ES6 추가
 *  Destructuring : 비구조할당
 *  - 객체 또는 배열에 입력된 값을 변수에 할당하는 간편 방식 제공
 * 
 *  배열관련 이해하기
 */
let arr1 = [1, 2, 3];
let a = arr1[0];
let b = arr1[1];
let c = arr1[2];
console.log(a, b, c);

let arr2 = [10, 20, 30];
let [a1, b1, c1] = arr2;
console.log(a1, b1, c1); 

[a1, b1, c1] = [100, 200];