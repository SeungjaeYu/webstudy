/**
 * require 에 찾는 파일의 확장자가 없는 경우
 * 1. .js파일을 찾는다
 * 2. .js 파일이 없는 경우 이름에 해당하는 디렉토리를 찾는다.
 *    디렉토리 하위의 index.js 파일을 찾는다.
 */

const cal = require("./test04_module");
console.log(cal.add(20, 10));
console.log(cal.sub(20, 10));



 /*
const cal = require("./test04_module");
console.log(cal.add(20, 10));
console.log(cal.sub(20, 10));
*/