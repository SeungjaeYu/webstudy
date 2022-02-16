let p = new Promise((resolve, reject) => {
    console.log('promise');
    setTimeout(() => {
        reject({error : "데이터 처리시 에러발생"});
    }, 2000);
});
//p.then();
p.catch((data) => {
    
    console.log("catch", "reject");
});
