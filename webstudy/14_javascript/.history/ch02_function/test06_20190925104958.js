/**
 *  sum 함수 구현하기
 *  1. arr이 없을 경우 0을 반환
 *  2. start 없을 경우 0을 할당해서 계산
 *  3. end 없을 경우 배열의 길이를 할당해서 계산
 *  4. 배열의 중간에 숫자가 아닌 값이 있을 경우 빼고 계산
 * 
 */
let sum = function (arr, start, end) {
    if (!arr) return 0;
    start = start || 0;
    if (start !== undefined) s = start;
    let l = arr.length;
    if (end !== undefined) l = end;
    let sum = 0;
    for (let i = s; i < l ; i++ ) {
        if (typeof(arr[i]) !==  'number') continue;
        sum += arr[i];
    }
    return sum;
}

let arr = [1, 2, '홍', 4, 5];
console.log( sum(arr, 0, arr.length) );    // 12
console.log( sum(arr, 0, 4) );             // 7
console.log( sum(arr, 0) );                // 12
console.log( sum(arr, 0) );                // 12
console.log( sum(arr, 2) );                // 9
console.log( sum(arr) );                   // 12
console.log( sum() );                      // 0