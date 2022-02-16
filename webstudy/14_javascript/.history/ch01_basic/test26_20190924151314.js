function isMan(juminNo) {
    console.log(juminNo.length);
    if (juminNo.length != 13) {
        throw new Error("주민번호는 13자리 입니다.");
    }
}
try {
    isMan('123456');
    
} catch (error) {
    
}
isMan('1111111111111');