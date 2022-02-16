let arr = [1, 2, 3, 4, 5];
let sum = 0;
for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
}
console.log("합 : ", sum);


function arrFor(arr, cb) {
    for (let i = 0; i < arr.length; i++) {
        cb(arr[i], i);
    }
}
sum = 0;
arrFor(arr, function(val) { sum += val; });
console.log("총합 : ", sum);
// arr 배열에서 짝수번째(0, 2, 4) 인덱스의 요소의 합을 출력
sum = 0;
arrFor(arr, function(val, i) { 
    if (i % 2 == 0) sum += val;
 });
console.log("짝수의 합 : ", sum);

sum = 0;
arr.forEach(function(val, i) {
    if (i % 2 == 0) sum += val;
    console.log("짝수의 합 : ", sum);
});

