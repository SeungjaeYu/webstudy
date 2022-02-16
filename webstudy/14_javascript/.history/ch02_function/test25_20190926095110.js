

function calClosure(num1, val2) {
    return function(comm) {
        switch (comm) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num1 / num2;
        }
    }
}


let cal = calClosure(10, 2);
console.log(cal("+"));  // 12
console.log(cal("-"));  // 8
console.log(cal("*"));  // 20
console.log(cal("/"));  // 6