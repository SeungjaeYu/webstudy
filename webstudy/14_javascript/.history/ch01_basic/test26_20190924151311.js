function isMan(juminNo) {
    console.log(juminNo.length);
    if (juminNo.length != 13) {
        throw new Error("주민번호는 13자리 입니다.");
    }
}
try {
    
} catch (error) {
    
}
isMan('123456');
isMan('1111111111111');