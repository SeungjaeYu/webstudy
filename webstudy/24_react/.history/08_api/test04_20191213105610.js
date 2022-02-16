let p = new Promise((resolve, reject) => {
    setTimeout(() => {
        let num = parseInt(Math.random)
        resolve();
        reject();
    }, 2000);
}).then(() => {
    console.log("ㅎㅇ");
}).catch(() => {
    console.log("ㅂㅇ");
})