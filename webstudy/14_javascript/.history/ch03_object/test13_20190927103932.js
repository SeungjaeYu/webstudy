/**
 *  객체의 디스트럭처링
 */
function getMember() {
    return {
        id: "a",
        name: "b",
        age: 1
    };
}
let m = getMember();
console.log(m.id, m.name, m.age);

let {id, name, age} = getMember();
console.log(id, name, age);

{id, name, age} = getMember();
console.log(id, name, age);