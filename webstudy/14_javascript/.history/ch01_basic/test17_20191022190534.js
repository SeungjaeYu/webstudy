/**
 *  자바스크립트의 false 인 값
 * 
 *  null, undefined, NaN, 0, ''(길이가 없는 문자열)
 */

console.log("0 : ", !!0);
console.log("9 : ", !!9);
console.log("null : ", !null);
console.log("'' : ", !!'');
console.log("undefined : ", !!undefined);
console.log("NaN : ", !!NaN);

let id = 'kim'; // true 테스트 진행
// let id;    // false 테스트 진행..
if (id) {
    console.log("id가 값을 가지고 있다.")
} else {
    console.log("id 가 값이 없다..")
    id = "hong";
}
console.log("id : ", id);