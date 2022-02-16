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
function myMap(arr, cbb) {
    let data = [];
    for (let i = 0; i < arr.length; i++) {
        
            data.push(cbb());
        
    }

    return data;
}

let result = filter(data, function(val) {
    // data 배열에서 30보다 작은 것만 ..
    if (val < 30) return true;
    return false;
});
console.log("result : ", result);

result = data.filter(function(val) {
    if (val % 2 == 0) return true;
    return false;
});

console.log("result : ", result);


result = data.map(function (val) {
    if (val % 2 == 0) return val * val;
    return val;
});
result = myMap(function (val) {
    if (val % 2 == 0) return val * val;
    return val;
});
console.log("result  : ", result);  // result : [ 3, 9, 27, 6400, 43 ]

