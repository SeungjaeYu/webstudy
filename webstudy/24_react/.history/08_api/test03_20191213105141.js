let p = new Promise((resolve, reject) => {
    console.log('promise');
    setTimeout(() => {
        reject();
    }, 2000);
});
//p.then();
p.catch();
