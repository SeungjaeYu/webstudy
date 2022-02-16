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

arrFor(arr, function(val) {
    console.log("호출됨 : ", val);
});
