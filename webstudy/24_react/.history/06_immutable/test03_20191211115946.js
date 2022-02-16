// 불변성을 지키는 처리하는 방식 - 배열
/*
    원본 변경 : push, splice, pop, ..
    원본 복사 : concat, slice, map, filter
*/
let arr1 = [1, 2, 3];
let arr2 = arr1.push(4);

console.log(arr1, arr2);

let arr3 = arr1.concat(5);
console.log(arr1, arr3);

let arr4 = arr1.slice(0, 2);
console.log(arr1, arr4);

let arr5 = arr1.slice();
console.log(arr1, arr5);

let arr6 = arr1.map(val => val * val);
console.log(arr1, arr6);

let arr7 = arr1.filter()