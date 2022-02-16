function nextId() {
    let id = 1;
    return function () { return id++; };
}
let id1 = nextId();
console.log(id1());
con