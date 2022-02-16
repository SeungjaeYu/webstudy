function doAction() {
    let id = 1;
}

function nextId() {
    
    return function () { return id++; };
}
let id1 = nextId();