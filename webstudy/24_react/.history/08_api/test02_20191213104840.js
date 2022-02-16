let p = new Promise((resolve, reject) => {
    console.log('ㅎㅇ');
    setTimeout(() => {
        resolve({ msg: 'hello~' });
    }, 3000);
});

p.then(data => {
    console.log(data.msg);
    console.log('ㅂㅇ');
});
