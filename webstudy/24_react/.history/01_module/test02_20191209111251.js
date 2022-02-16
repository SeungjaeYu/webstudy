import cal, { add, sub as s, a } from "./cal2"; // default는 기본 객체로 지정이 된다. 하나만 있어야 한다. 꼭 이름 줄 필요가 없다.
console.log(add(200,50));
//  console.log(sub(200,50)); -> sub is not defined
console.log(s(200,50));
console.log(a());
console.log(cal());



