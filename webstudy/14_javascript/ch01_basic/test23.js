/**
 *  배열에 데이터 추가하기, 삭제하기
 */
let arr = [10, 20, 30];

// 마지막에 데이터 추가하기
arr[arr.length] = 40;
console.log(arr);

arr.push(50);
console.log(arr);

let arr2 = arr;
console.log(arr2);

arr2.push(60);
console.log(arr);
console.log(arr2);

arr.splice(0, 1);
console.log(arr);
console.log(arr2);