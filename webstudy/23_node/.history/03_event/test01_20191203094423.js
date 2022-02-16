/**
 * 이벤트를 연결할수 있는 모든 객체는 EventEmitter 객체의 상속을 받는다.
 * 사용자가 이벤트를 정의 하려면 EventEmitter 객체를 이용한다.
 * 
 * on   : 이벤트 설정
 * emit : 이벤트 호출
 */
//let Member = function () {};
const EventEmitter = require("events").EventEmitter;
const util = require("util");   // 상속 처리를 위해

// 직접 정의하는 이벤트 등록할 객체
const Member = function() {};

// Member 객체가 EventEmitter를 상속
util.inherits(Member, EventEmitter);

Member.prototype.join = function() {
    console.log("join 호출됨");
};

Member.prototype.list = function() {
    console.log("list 호출됨");
};

let m = new Member();

m.on("c");

m.join();
m.list();


