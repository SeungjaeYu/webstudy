let data = [3, 9, 27, 80, 43];

// data 배열에서 특정조건(30보다 작은)을 만족하는 데이터를 새로운 배열로 생성
let newData = [];
for (let i = 0; i < data.length; i++) {
    if (data[i] < 30) {
        newData.push(data[i]);
    }
}

console.log(newData);

let newData2 = [];
for (let i = 0; i < data.length; i++) {
    if (data[i] % 2 == 0) {
        newData2.push(data[i]);
    }
}

console.log(newData2);

function filter(arr, cb) {
    let data = [];
    for (let i = 0; i < arr.length; i++) {
        if (cb(arr[i])) {
            data.push(arr[i]);
        }
    }

    return data;
}

let result = filter(data, function(val) {
    // data 배열에서 30보다 작은 것만 ..
    if (val < 30) return true;
    return false;
});
console.log("result : ", result);

data.filter(fu);