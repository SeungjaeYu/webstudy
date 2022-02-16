let arr = [1, 2, '홍', 4, 5];
console.log( sum(arr, 0, arr.length) );    // 12
console.log( sum(arr, 0, 4) );             // 7
console.log( sum(arr, 0) );                // 12
console.log( sum(arr, 0) );                // 12
console.log( sum(arr, 2) );                // 9
console.log( sum(arr) );                   // 12
console.log( sum() );