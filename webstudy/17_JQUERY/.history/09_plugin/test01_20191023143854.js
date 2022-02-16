// 플러그인 추가 : $.기능
$.arr = function (obj, comm) {
    let result;
    if (comm === "max") {
        result = obj[0];
        for (let val of obj) {
            if (result < val) result = val;
        }
    } else if (comm === "min") {
        result = obj[0];
        for (let val of obj) {
            if (result < val) result = val;
        }

        얼스 이프
    }
}