const singers = [
    '나플라', '루피', '넉살', '비와이', '리듬파워', '그레이', '박재범', '도끼', '더콰이어', '쌈디'
];
let count = 10;



function func(idx) {
    return singers[idx];
}


let id = setInterval(() => {
    if (count == 0) {
        console.log(func(parseInt(Math.random() * singers.length)));                
    }
    console.log(count);
    count--;  
}  , 1000);


setTimeout(() =>  clearInterval(id), 11000);

let idx = parseInt(Math.random() * singers.length);
console.log(func(idx));