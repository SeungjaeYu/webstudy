/**
 *  배열
 *  생성하는 방법 : [] 또는 Array()
 */
let arr1 = [];
let arr2 = new Array();

console.log("arr1.length : ", arr1.length);
console.log("arr2.length : ", arr2.length);
console.log(arr1[0], arr2[0]);

// 자바스크립트 배열의 크기는 마지막 인덱스 번호 + 1 이다.
arr1[0] = 10;
arr1[1] = 20;
arr1[3] = 30;

console.log("arr1.length : ", arr1.length);

arr1[""]