/**
 *  객체의 단축 표현 이해하기
 */
let id = 'hong',
    name = '홍',
    age = 11;
function setInfo(id, name, age) {
    return {
        id: id,
        name: name,
        age: age;
    };
}
let member1 = {
    id: id,
};