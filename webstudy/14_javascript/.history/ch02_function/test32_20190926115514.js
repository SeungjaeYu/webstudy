const singers = [
    '나플라', '루피', '넉살', '비와이', '리듬파워', '그레이', '박재범', '도끼', '더콰이어', '쌈디'
];
let count = 10;

function func() {
    console.log("func 호출됨..");
}
// setTimeout(func, 1000);
let id = setInterval(func, 1000);
setTimeout(() =>  clearInterval(id), 5100);

parseInt(Math.random() * singers.length);