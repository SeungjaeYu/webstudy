let p = new Promise((resolve, reject) => {
    setTimeout(() => {
        let num = parseInt(Math.random() * 100) % 2;
        resolve();
        reject();
    }, 2000);
});
p.then(() => {}).catch(() => {})