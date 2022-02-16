let msg1;
if (msg1 === undefined) console.log("변수는 존재하지만 값이 없는 상태");

let msg2 = 20;
msg2 = undefined;   // 타입이 없는 상태로 만들 수 있음..
msg2 === undefined && console.log("undefiiend는 직접 비교 가능함..");

let msg3 = null
