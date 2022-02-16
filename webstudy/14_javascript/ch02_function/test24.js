/**
 *  클로저2
 * 
 */

function nextId() {
    let id = 1;
    return function () { return id++; };
}
let id1 = nextId();
console.log(id1());
console.log(id1());

let id2 = nextId();
console.log(id2());
console.log(id2());