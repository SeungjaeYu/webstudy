let fn = function () {
    return function() {
        console.log("호출됨..");
    };
};

fn()();

// 화살표 함수 사용
let fn2 = () => () => console.log("호출됨..");

fn()();