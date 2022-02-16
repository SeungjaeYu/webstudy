// 호이스팅 이해 퀴즈
console.log(id); // undefined

var id ="테스트";
console.log(id); // 테스트

/**
 *  1단계
 *  var id;
 *  
 *  2단계
 *  console.log(id);
 *  id = ""
 *  console.log(id);
 */