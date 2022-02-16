/**
 *  객체의 단축 표현 이해하기
 */
let id = 'hong',
    name = '홍',
    age = 11;

// 변수의 이름을 프로퍼티명으로 사용    
let member1 = {
    id,
    name,
    age,
    info: function() {
        console.log("info...");
    }
};
console.log(member1);


let member2 = {
    id,
    name,
    age,
    info: function() {
        console.log("info...");
    }
};
console.log(member2);


function setInfo(id, name, age) {
    return {
        id: id,
        name: name,
        age: age
    };
}
let m = setInfo("hong", "홍", 11);

