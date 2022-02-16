let get = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve();
        }, 2000);
        
    });
};