function nextId() {
    let id = 1;
    return function () { return id++; }
}