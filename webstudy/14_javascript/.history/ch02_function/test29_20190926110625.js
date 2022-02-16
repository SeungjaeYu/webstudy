function doAction(co) {
    let id = 1;
    return function () { return id++; };
}

let id1 = nextId();