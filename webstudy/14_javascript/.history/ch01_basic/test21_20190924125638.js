let arr = [10, 20, 30, 40, 50];
// 범위 지정 사용
for (let i = 0; i < arr.length; i++) {
    console.log("i : " + arr[i]);
}

// 객체의 값 : 자바의 향상된 for
for (let val of arr) {
    console.log(val);
}

