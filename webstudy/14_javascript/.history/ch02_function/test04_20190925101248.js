function foo() {
    console.log(1);
}
foo();
let foo = function() {
    console.log(2);
};

foo();

function foo() {
    console.log(3);
}
