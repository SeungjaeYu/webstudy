let p = new Promise((resolve, reject) => {
    setTimeout(() => {
        let num = parseInt(Math.random() * 100) % 2;
        if (num === 0) {
            resolve();
        } else {
            reject();
        }
    }, 2000);
});
p.then(() => {
    
}).catch(() => {});