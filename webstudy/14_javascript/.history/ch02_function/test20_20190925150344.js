let fn = function () {
    return function() {
        console.log("호출됨..");
    };
};

fn()();


let fn2 = () => {
    return () => {
        console.log("호출됨..");
    };
};

fn()();