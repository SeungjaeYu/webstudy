/**
 *  사용자 생성
 * 
 *  권한 부여
 * 
 *  MySQL 데이터 접속하기
 * 
 *  1. 외부 모듈 설치하기
 *     npm install mysql
 *  
 *  2. 모듈 사용하기
 *     const mysql = require("mysql");
 * 
 *  const a = [];
 *  a.push("aa") => 가능
 *  a = .. => 불가능
 */

 const mysql = require("mysql");
 let con = mysql.createConnection({
     host: "localhost",
     port: 3306,
     user: "bit2019",
     password: "bit2019"
 });

 con.connect((err) => {
    if (err) {
        console.log("연결시 에러가 발생했습니다.");
        console.log(err.stack);
        return;
    }
    console.log("연결성공");
 });
// 데이터베이스 생성하기
con.query("create database bitdb default character set utf8", (err, result) => {
    if (err) {
        
    }
});


 con.end((err) => {
    if (err) {
        console.log("종료시 에러가 발생했습니다.");
        console.log(err.stack);
        return;
    }
    console.log("데이터베이스 연결 종료");
 });

