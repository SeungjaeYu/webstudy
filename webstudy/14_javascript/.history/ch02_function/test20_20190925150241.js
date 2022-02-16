let fn = function () {
    return function() {
        console.log("호출됨..");
    };
};

fn()();


let fn = function () {
    return function() {
        console.log("호출됨..");
    };
};

fn()();