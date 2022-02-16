function isMan(juminNo) {
    console.log(juminNo.length);
    if (juminNo.length != 13) {
        throw new Error("주민번호는 13자리 입니다.");
    }
}
try {
    isMan('123456');
    
} catch (e) {
    console.log("에러발생");
    console.log(e.()));
}
console.log("정상 종료됨...");