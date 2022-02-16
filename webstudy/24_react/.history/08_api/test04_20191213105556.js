let p = new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve();
        reject();

    }, 2000);
}).then(() => {
    console.log("ㅎㅇ");
}).catch(() => {
    console.log("ㅂㅇ");
})