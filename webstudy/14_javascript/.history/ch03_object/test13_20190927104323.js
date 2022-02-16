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

let {id: id1, name: name1, age: age1} = getMember();
console.log(id1, name1, age1);

let {email: eee, addr} = {email:"a", addr:"b"};
// console.log(email);
console.log(eee);

