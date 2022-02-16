/**
 *  변수의 호이스팅
 * 
 *  - 엔진이 스크립트를 해석하는 과정
 *  - 컴파일(1단계)
 *  - 실행(2단계)
 * 
 *  컴파일 단계에서 변수의 정보를 먼저 설정
 *  
 */

var id = "hong";
console.log(id);

// 중복 선언
var id = "kim";
console.log(id);

var name;
console.log(name);

/**
 *  호이스팅 과정
 * 
 *  1. 컴파일
 *  var id;
 *  var name;
 * 
 *  id = "hong";
 *  console.log(id);
 *  id = "kim";
 *  console.log(id);
 *  
 */