let p = new Promise((resolve, reject) => {
    setTimeout(() => {
        
    }, 2000);
    resolve();
    reject();
}).then(() => {
    console.log("ㅎㅇ");
}).catch(() => {
    console.log("ㅂㅇ");
})