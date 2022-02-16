let p = new Promise((resolve, reject) => {
    resolve();
    reject();
}).then(() => {
    console.log("ㅎㅇ");
}).catch(() => {
    console.log("ㅂㅇ");
})