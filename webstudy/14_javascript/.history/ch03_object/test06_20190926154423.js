/**
 *  여러개의 객체 관리
 * 
 *  조조 33 남 성남
 *  유비 44 남 강화
 *  항우 55 남 산성
 *  여포 22 여 여주
 */
let m1 = {name: '조조', age: 33, gender: '남', addr: '성남'};
let m2 = {name: '유비', age: 33, gender: '남', addr: '성남'};
let m3 = {name: '항우', age: 33, gender: '남', addr: '성남'};
let m4 = {name: '여포', age: 33, gender: '여', addr: '여주'};

function setInfo(name, age, gender, addr) {
    return {name: name, age: age, gender: gender, addr: addr};
}

setInfo()