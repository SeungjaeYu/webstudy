let get = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve();
        }, 2000);

    });
};
let p = get();
p.then(() => {
    console.log("then");
})