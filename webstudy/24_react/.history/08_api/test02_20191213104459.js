let p = new Promise((resolve, reject) => {
    console.log("ㅎㅇ");
    setTimeout(() => {
        resolve();
    }, 3000);
});

p.then(() => {
    console.log("ㅂㅇ");
})
