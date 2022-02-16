// path 모듈 : 경로에 대한 다양한 값을 추출
const path = require("path");    // 내장 모듈이기 때문에 접근 가능

console.log(path.join("c:/test"));
console.log(path.join("c:/test", "/aa/bb", "/index.js"));
// c:\test\aa\bb\index.js
console.log(path.join("c:/test", "aa/bb/", "/index.js"));    // 앞 뒤에 경로 /가 없어도, /가 2개여도 경로에 맞춰서 지정해 준다.
// c:\test\aa\bb\index.js

let fileName = "c:/test/aa/bb/index.js";
console.log("디렉토리 : " + path.dirname(fileName));
console.log("확장자 : " + path.extname(fileName));
console.log("파일이름 : " + path.basename(fileName));
console.log("파일이름(확장자 제외) : " + path.basename(fileName, ".js"));
console.log("파일이름(확장자 제외) : " + path.basename(fileName, ".js"));

